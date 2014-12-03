package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.util.Random;
/**
 * A tile that represtents land
 * @author grunes
 *
 */
public class Land extends Tile{
	
	public Land(int maxPlants, int range, int x, int y){
		super(x, y);
		Random rand = new Random();
		this.maxPlants = maxPlants;
		if(range>0)
			this.maxPlants += rand.nextInt(range);
		if(this.maxPlants<0)
			this.maxPlants=0;
		if(this.maxPlants>100)
			this.maxPlants=100;
		plants = maxPlants/2;
		
	}
	/**
	 * A shade from white to yellow to green based on the amount of food on the tile
	 */
	protected Color calcColor(){
		if(plants>66)
			return new Color(0,255-((int)plants-66)*3,0);
		else if(plants>33)
			return new Color(255-((int)plants-33)*255/33,255,0);
		else
			return new Color(255,255,255-255/33*(int)plants);
	}
}
