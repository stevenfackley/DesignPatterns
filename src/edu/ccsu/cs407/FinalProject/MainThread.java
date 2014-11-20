package edu.ccsu.cs407.FinalProject;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.ccsu.cs407.FinalProject.Creatures.ConcreteCreatureFactory;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Environment.Grid;
import edu.ccsu.cs407.FinalProject.UI.MyFrame;

public class MainThread implements Runnable
{
	// layout of the map where the world data is stored and where instances of animals are kept
	public static Grid grid = new Grid(50,50);
	// top level swing container
	public static MyFrame frame = new MyFrame(800,600);
	//ms from the program launch
	public static int time=0;
	//ms per loop in the run function
	public static final int timePerFrame = 10;
	
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MainThread());
		t1.start();
	}

	MainThread(){}
	
	@Override
	public void run() {
		 /*
		  * CODE TO BE RUN ONCE AT THE START OF THE PROGRAM
		  */
		ConcreteCreatureFactory factory = ConcreteCreatureFactory.getInstance();
		// Make a creature by making a call to the creature factory
		Creature wolf = factory.createCreature("wolf");
		// Print the creature
		System.out.println(wolf.toString());
		try {
			/*
			 * CODE TO BE RUN OVER THE LIFE OF THE PROGRAM
			 */
			while(true){
				grid.step();
				Thread.sleep(timePerFrame);
				time+=timePerFrame;
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}