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
	public Tile(){}
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
			if(creature!=null){
				g.setColor(Color.CYAN);
				g.fillOval(startX+1, startY+1, tileSize-2, tileSize-2);
				g.setColor(Color.RED);
				if(tileSize>10)
					g.fillRect(startX+tileSize*1/10, startY+tileSize*7/10, tileSize*8/10, tileSize*2/10);
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
	public void setCreature(Creature creature){
		this.creature=creature;
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
