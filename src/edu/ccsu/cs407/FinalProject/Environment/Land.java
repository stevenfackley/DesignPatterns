package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.util.Random;

public class Land extends Tile{
	
	public Land(int maxPlants, int range){
		Random rand = new Random();
		this.maxPlants = maxPlants;
		if(range>0)
			this.maxPlants -= rand.nextInt(range);
		if(this.maxPlants<0)
			this.maxPlants=0;
		if(this.maxPlants>100)
			this.maxPlants=100;
		plants = 1;
		
	}
	
	protected Color calcColor(){
		if(plants>66)
			return new Color(0,255-((int)plants-66)*3,0);
		else if(plants>33)
			return new Color(255-((int)plants-33)*255/33,255,0);
		else
			return new Color(255,255,255-255/33*(int)plants);
	}
}
