package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * A single space on the grid, represents a 10m area of land in the simulation
 * stores information on plants and creatures in the area
 * @author grunes
 *
 */
public class Tile {
	protected double plants = 0;
	protected int maxPlants = 0;
	protected Creature creature = null;
	protected Creature attackingCreature = null;
	protected Creature tempCreature = null;
	private int xPos;
	private int yPos;
	public Tile(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	/**
	 * Draws the tile to the screen and if the tile is zoomed
	 * in enough draws any creatures on the tile
	 * @param tileSize Size of the onscreen representation of the tile
	 * @param startX x-position of the tile on the screen
	 * @param startY y-position of the tile on the screen
	 * @param g Graphics of the component being drawn to
	 */
	public void draw(int tileSize, int startX, int startY, Graphics g){
		g.setColor(calcColor());
		g.fillRect(startX, startY, tileSize, tileSize);
		if(tileSize>5){
			if(creature!=null)
				tempCreature=creature;
			else
				tempCreature=null;
			if(tempCreature!=null){
				if(tempCreature.canEatPlants() && !tempCreature.canEatAnimals())
					g.setColor(Color.CYAN);
				else if(!tempCreature.canEatPlants() && tempCreature.canEatAnimals())
					g.setColor(Color.ORANGE);
				else
					g.setColor(Color.GRAY);
				int size = (tileSize-2)*tempCreature.getHealth()/60;
				g.fillOval(startX+(tileSize-size)/2, startY+(tileSize-size)/2, size, size);
				g.setColor(new Color(0,0,0,75));
				g.drawOval(startX+(tileSize-size)/2, startY+(tileSize-size)/2, size, size);
				if(tileSize>10){
					g.setColor(Color.PINK);
					g.fillRect(startX+tileSize*1/10, startY+tileSize*1/10, tileSize*8/10, tileSize*2/10);
					g.setColor(Color.RED);
					g.fillRect(startX+tileSize*1/10, startY+tileSize*1/10, tileSize*8/10*(tempCreature.getDamage()-tempCreature.getDamageTaken())/tempCreature.getDamage(), tileSize*2/10);
					g.setColor(new Color(0,0,0,75));
					g.drawRect(startX+tileSize*1/10, startY+tileSize*1/10, tileSize*8/10, tileSize*2/10);
				}
			}
		}
			
	}
	/**
	 * @return  Current number of plants on the tile
	 */
	public double getPlants(){
		return plants; 
	}
	/**
	 * @return Maximum amount of plants on the tile
	 */
	public double getMaxPlants(){
		return maxPlants;
	}
	/**
	 * @return The creature on the tile
	 */
	public Creature getCreature(){
		return creature;
	}
	
	/**
	 * @return x position of the tile
	 */
	public int getX()
	{
		return xPos;
	}
	
	/**
	 * @return y position of the tile
	 */
	public int getY()
	{
		return yPos;
	}
	
	/**
	 * @param tile t
	 * @return distance between this tile and another tile
	 * passed in to the argument.
	 */
	public double getDistance(Tile t)
	{
		double xDif = t.getX() - xPos;
		double yDif = t.getY() - yPos;
		double xDifSq = xDif * xDif;
		double yDifSq = yDif * yDif;
		double result = Math.sqrt(Math.abs(xDifSq+yDifSq));
		
		
		return result;
	}
	
	public Creature getAttackingCreature()
	{
		return attackingCreature;
	}
	
	public void setAttackingCreature(Creature c)
	{
		attackingCreature = c;
	}
	
	
	
	/**
	 * @param plants value of plants to set the tile to
	 */
	public void setPlants(int plants){
		if(maxPlants>plants)
			this.plants=plants;
		else
			this.plants=maxPlants;
	}
	/**
	 * @param creature a creature to be added to the tile
	 */
	public void setCreature(Creature c)
	{

			this.creature=c;
	}
	
	public void clearCreature()
	{
		this.creature = null;
	}
	/**
	 * @return the color of the tile
	 */
	protected Color calcColor(){
		return null;
	}
	/**
	 * moves the simulaton forward one step on the tile
	 */
	public void step(){
		//regrows plants in a S-curve, takes about 50 cycles to bring plants from ~5% to ~95%
		if(maxPlants!=0){
			plants+=((plants+1)/(maxPlants+1))*((1-plants/maxPlants));
			if(maxPlants<plants){
				plants=maxPlants;
			}
		}
	}
}
