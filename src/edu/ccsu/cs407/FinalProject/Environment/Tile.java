package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;

import edu.ccsu.cs407.FinalProject.MainThread;

public class Tile {
	protected double plants = 0;
	protected int maxPlants = 0;
	public Tile(){}
	
	public void draw(int tileSize, int startX, int startY, Graphics g){
		g.setColor(calcColor());
		g.fillRect(startX, startY, tileSize, tileSize);
	}
	
	public double getPlants(){
		return plants;
	}
	
	public void setPlants(int plants){
		this.plants=plants;
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
