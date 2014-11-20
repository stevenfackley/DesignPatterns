package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.ccsu.cs407.FinalProject.MainThread;

public class MyCanvas extends JPanel{
	int i=0;
	public MyCanvas(){
		this.setSize(400,800);
		this.setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int tileSize = this.getWidth()/MainThread.grid.getSquaresX();
		if(this.getHeight()/MainThread.grid.getSquaresY()<tileSize)
			tileSize = this.getHeight()/MainThread.grid.getSquaresY();
		MainThread.grid.draw(tileSize, (this.getWidth()-tileSize*MainThread.grid.getSquaresX())/2, (this.getHeight()-tileSize*MainThread.grid.getSquaresY())/2, g);
		i++;
		repaint();
	}
}
