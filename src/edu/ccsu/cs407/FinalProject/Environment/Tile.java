package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;

public class Tile {
	protected Color color = null;
	protected String type = "";
	public Tile(){}
	
	public void draw(int tileSize, int startX, int startY, Graphics g){
		g.setColor(this.color);
		g.fillRect(startX, startY, tileSize, tileSize);
	}
}
