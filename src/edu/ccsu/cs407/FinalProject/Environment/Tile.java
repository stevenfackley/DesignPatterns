package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class Tile {
	protected double plants = 0;
	protected int maxPlants = 0;
	protected Creature creature = null;
	public Tile(){}
	
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
	
	public double getPlants(){
		return plants;
	}
	
	public double getMaxPlants(){
		return maxPlants;
	}
	
	public Creature getCreature(){
		return creature;
	}
	
	public void setPlants(int plants){
		this.plants=plants;
	}
	
	public void setCreature(Creature creature){
		this.creature=creature;
	}
	
	protected Color calcColor(){
		return null;
	}
	
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
