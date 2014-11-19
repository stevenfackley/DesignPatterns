package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.util.Random;

public class Land extends Tile{
	private int food = 0;
	
	public Land(){
		Random rand = new Random();
		food = rand.nextInt(100)+1;
		color = new Color(0,255-food,0);
		type = "land";
	}
}
