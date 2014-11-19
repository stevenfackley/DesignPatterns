package edu.ccsu.cs407.FinalProject;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.ccsu.cs407.FinalProject.Creatures.ConcreteCreatureFactory;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

public class Main
{
	private static Grid grid = new Grid(50,50);
	
	public static void main(String[] args) 
	{
		// Get an instance of a creature factory
		ConcreteCreatureFactory factory = ConcreteCreatureFactory.getInstance();
		
		// Make a creature by making a call to the creature factory
		Creature wolf = factory.createCreature("wolf");
		
		// Print the creature
		System.out.println(wolf.toString());
		
		MyFrame frame = new MyFrame(800,600);		
	}
	static class MyFrame extends JFrame {		
		public MyFrame(int width,int height){
			this.setSize(width, height);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			this.setResizable(false);
			Canvas canvas = new Canvas();
			this.add(canvas);
			canvas.paintComponent(this.getGraphics());
		}
	}
	
	static class Canvas extends JPanel{
		int i=0;
		public Canvas(){
			this.setSize(400,800);
			this.setBackground(Color.WHITE);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			int tileSize = this.getWidth()/grid.getSquaresX();
			if(this.getHeight()/grid.getSquaresY()<tileSize)
				tileSize = this.getHeight()/grid.getSquaresY();
			grid.draw(tileSize, (this.getWidth()-tileSize*grid.getSquaresX())/2, (this.getHeight()-tileSize*grid.getSquaresY())/2, g);
			i++;
			repaint();
		}
	}
}