package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
/**
 * A tile representing water
 * @author grunes
 */
public class Water extends Tile{
	public Water(int x, int y)
	{
		super(x,y);
	}
	/**
	 * Always returns blue
	 */
	protected Color calcColor(){
		return Color.BLUE;
	}
}
