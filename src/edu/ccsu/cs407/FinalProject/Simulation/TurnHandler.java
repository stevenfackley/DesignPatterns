package edu.ccsu.cs407.FinalProject.Simulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Environment.Grid;
import edu.ccsu.cs407.FinalProject.Environment.Land;
import edu.ccsu.cs407.FinalProject.Environment.Tile;

/**
 * Turn Handler
 * This object contains all of the logic for executing
 * a turn for each creature on a grid. 
 * @author Dylan
 * @author seth
 * @author steve
 */

public class TurnHandler 
{
	private static TurnHandler instance = null;
	private Grid grid = null;
	private ArrayList<Creature> creatures = new ArrayList<Creature>();
	private ArrayList<Creature> workingCreaturesList = new ArrayList<Creature>();
	
	/**
	 * Implements the singleton pattern. Shouldnt be more
	 * than one turn handler per program instance. 
	 */
	
	/**
	 * Private constructor
	 */
	private TurnHandler(){}
	
	/**
	 * getinstance
	 * Returns the instance of the turn handler if it exists
	 * otherwise it makes one and returns it. 
	 * @return instance of turn handler
	 */
	public static TurnHandler getInstance()
	{
		if (instance == null){
			instance = new TurnHandler();
		}
		return instance;
	}
	
	/**
	 * setGrid
	 * sets the private grid object that this object
	 * processes on. Allows it to be changed dynamically
	 * if the grid changes.
	 * @param grig g
	 */
	public void setGrid(Grid g){
		grid = g;
		creatures = grid.getCreatures();
		workingCreaturesList = grid.getCreatures();
	}
	
	/**
	 * Steps through creature turn
	 */
	public void step()
	{
		System.out.println("Step");
		for (Creature c : creatures)
		{
			ExecuteCreatureTurn(c);
		}
		creatures = copyCreatureList(workingCreaturesList);
	}
	
	
	/**
	 * Executes a creatures turn
	 * @param c Creature
	 */
	private void ExecuteCreatureTurn(Creature c)
	{
		Eat(c);
	}
	
	
	/**
	 * Gets a creature to eat
	 * @param c Creature
	 */
	private void Eat(Creature c)
	{
		//System.out.println(c.getX() + " " + c.getY());
		ArrayList<Tile> surroundings = new ArrayList<Tile>();
		surroundings = getSurroundings(c);
		
		ArrayList<Tile> foodList = new ArrayList<Tile>();
		foodList = locateFoodSources(surroundings, c);
		
		// if the creature found food sources
		if (foodList.size()>0)
		{
			Tile foodTarget = getClosest(grid.getTile(c.getX(), c.getY()), foodList);
			
			// the target doesnt have a creature on it then eat plants
			if (foodTarget.getCreature()==null)
			{
				// move to the target
				// set old grid space creature instance to null
				grid.getTile(c.getX(), c.getY()).clearCreature();
				
				// set the creature instance of the grid space to c
				grid.getTile(foodTarget.getX(), foodTarget.getY()).setCreature(c);
				
				// update the position on the creature in the list
				c.setPosition(foodTarget.getX(), foodTarget.getY());
				
				// eat plants
				//c.heal(c.getSufficientFood());
				
				// deduct plants from the target
				foodTarget.setPlants(((int)foodTarget.getPlants() - c.getSufficientFood()));
			}
			// creature is a carnivore and targeted a space with a creature
			else
			{
				// remove both from the list
				workingCreaturesList.remove(c);
				workingCreaturesList.remove(foodTarget.getCreature());
				
				// set old grid space creature instance to null
				grid.getTile(c.getX(), c.getY()).clearCreature();
				
				// update the attacking creatures coordinates
				c.setPosition(foodTarget.getX(), foodTarget.getY());
				

				
				
				
				
			}
		}
		// the creature didnt find food
		else
		{
			System.out.println("didnt find food");
			
			// take damage equal to the amount of food it needed
			c.takeDamage(c.getSufficientFood());
			
			//check if its dead, if so remove it from the list
			//and remove it from the grid
			if (c.getDamageTaken() > c.getHealth())
			{
				workingCreaturesList.remove(c);
				grid.getTile(c.getX(), c.getY()).clearCreature();
			}
			//move creature to farthest open space on its range
			else
			{
				Tile moveTarget = getFarthestOpen(grid.getTile(c.getX(), c.getY()), surroundings);
				
				// set the creature instance of the old grid space to null
				grid.getTile(c.getX(), c.getY()).clearCreature();
				
				// set the creature instance of the grip space to c
				grid.getTile(moveTarget.getX(), moveTarget.getY()).setCreature(c);
				
				// update the creatures coordinates
				c.setPosition(moveTarget.getX(), moveTarget.getY());
			}
		}

		
	}
	
	/**
	 * @param surroundings
	 * @param c
	 * @return
	 */
	private ArrayList<Tile> locateFoodSources(ArrayList<Tile> surroundings, Creature c)
	{
		if (c.canEatPlants() && (c.canEatAnimals() == false))
		{
			surroundings = LookForPlants(surroundings, c);
		}
		// if creature is omnivore randomly choose to look for
		// plants or prey
		else if (c.canEatPlants() && c.canEatAnimals())
		{
			Random rand = new Random();
			int x = rand.nextInt(2);
			
			if (x==0)
			{
				surroundings = LookForPlants(surroundings, c);
			}
			else
			{
				surroundings = LookForPrey(surroundings, c);
			}
		}
		// creature is a carnivore so look for prey
		else
		{
			surroundings = LookForPrey(surroundings, c);
		}
		
		return surroundings;
	}
	
	/**
	 * @param ct
	 * @param t
	 * @return
	 */
	private Tile getFarthestOpen(Tile ct, ArrayList<Tile> t)
	{

		ArrayList<Tile> tempList = new ArrayList<Tile>();
		ArrayList<Tile> tiles = t;
		Collections.shuffle(tiles);
		
		// remove all tiles where there is a valid creature
		for (Tile tile : tiles)
			{
				if (tile.getCreature()==null)
				{
					tempList.add(tile);
				}
			}
				
		tiles = copyTileList(tempList);
		tempList.clear();
		
		Tile currentTile = ct;
	
		if (tiles.size()>1)
		{	
			Tile farthestTile = tiles.get(0);
			
			for (int i = 1; i<tiles.size(); i++)
			{
				if(currentTile.getDistance(tiles.get(i)) > currentTile.getDistance(farthestTile))
				{
					farthestTile = tiles.get(i);
				}
			}
			
			return farthestTile;
		}
		else
		{
			return currentTile;
		}
		
	}
	
	/**
	 * @param c
	 * @return
	 */
	private ArrayList<Tile> getSurroundings(Creature c)
	{
		// list of tiles in range of creatures movement speed
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		
		// Range, Creatures current X position, and Creatures current Y position.
		int range = c.getSpeed();
		int creatureX = c.getX();
		int creatureY = c.getY();
		
		// define min and max coordinates for square of reachable tiles
		int xMax = creatureX + range;
		int xMin = creatureX - range;
		int yMax = creatureY + range;
		int yMin = creatureY - range;
		
		// set mins and maxes to be in bounds if they are out of bounds
		if (xMax >= grid.getWidth())
			xMax = grid.getWidth()-1;
		
		if (yMax >= grid.getWidth())
			yMax = grid.getWidth()-1;
		
		if (xMin < 0)
			xMin = 0;
		
		if (yMin < 0)
			yMin = 0;
		
		
		// Iterate through the tiles in range and add them all to the list
		// if they are land
		for (int i = xMin; i <= xMax; i++)
		{
			for (int j = yMax; j >= yMin; j--)
			{
				if(grid.getTile(i, j) instanceof Land)
				{
					tiles.add(grid.getTile(i, j));
			
				}
		
			}
		}	
		
		return tiles;
	}
	
	/**
	 * @param t
	 * @param c
	 * @return
	 */
	private ArrayList<Tile> LookForPlants(ArrayList<Tile> t, Creature c)
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		ArrayList<Tile> tempList = t;
		
		// remove all tiles where there is a creature
		// or are insufficient plants
		for (Tile tile : tempList)
		{
			if (tile.getCreature()==null && tile.getPlants() > c.getSufficientFood())
			{
				tiles.add(tile);
			}
		}
		
		return tiles;
	}
	
	/**
	 * @param t
	 * @param c
	 * @return
	 */
	private ArrayList<Tile> LookForPrey(ArrayList<Tile> t, Creature c)
	{
		ArrayList<Tile> tiles = t; 
		ArrayList<Tile> tempList = new ArrayList<Tile>();
		
		// remove all tiles where there isnt a valid creature
		for (Tile tile : tiles)
		{
			if (tile.getCreature()!=null)
			{
				tempList.add(tile);
			}
		}
		
		tiles = copyTileList(tempList);
		tempList.clear();
		
		
		// remove creatures own tile because it cant eat itself
		for (Tile tile : tiles)
		{
			if (!tile.getCreature().equals(c))
			{
				tempList.add(tile);
			}
		}
		
		tiles = copyTileList(tempList);
		tempList.clear();
	
		
		// remove bigger creatures if creature cant eat larger
		// animals
		if (c.canEatLarger()==false)
		{	
			for (Tile tile : tiles)
			{
				if (tile.getCreature().getWeight() < c.getWeight())
				{
					tempList.add(tile);
				}
			}
		
			tiles = copyTileList(tempList);
			tempList.clear();
		}
		
		
		// remove same species if the creature cant eat them
		if (c.canEatSameSpecies()==false)
		{
			for (Tile tile : tiles)
			{
				if (!c.getName().equalsIgnoreCase(tile.getCreature().getName()))
				{
					tempList.add(tile);
				}
			}
			
			tiles = copyTileList(tempList);
			tempList.clear();
		}
		
		return tiles;
	}
	
	/**
	 * @param ct
	 * @param tiles
	 * @return
	 */
	private Tile getClosest(Tile ct, ArrayList<Tile> tiles)
	{
		// pick the closest tile to the creature from a list of tiles
		Collections.shuffle(tiles);
		Tile closestTile = tiles.get(0);
		Tile currentTile = ct;
	
		if (tiles.size()>1)
		{	
			for (int i = 1; i<tiles.size(); i++)
			{
				if(currentTile.getDistance(tiles.get(i)) < currentTile.getDistance(closestTile))
				{
					closestTile = tiles.get(i);
				}
			}
	
		}
		
		return closestTile;
	}
	
	/**
	 * @param t
	 * @return
	 */
	private ArrayList<Tile> copyTileList(ArrayList<Tile> t)
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		
		for (Tile tile : t)
		{
			tiles.add(tile);
		}
		
		return tiles;
	}
	
	private ArrayList<Creature> copyCreatureList(ArrayList<Creature> c)
	{
		ArrayList<Creature> creatures = new ArrayList<Creature>();
		
		for (Creature creature : c)
		{
			creatures.add(creature);
		}
		
		return creatures;
		
	}
}
