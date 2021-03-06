package edu.ccsu.cs407.FinalProject;


import java.util.ArrayList;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Environment.Grid;
import edu.ccsu.cs407.FinalProject.Simulation.TurnHandler;
import edu.ccsu.cs407.FinalProject.UI.MyFrame;
import edu.ccsu.cs407.FinalProject.UI.Configration.CreatureConfiguration;

public class MainThread implements Runnable
{
	// layout of the map where the world data is stored and where instances of animals are kept
	public static Grid grid = null;
	//ms from the program launch
	public static int time=0;
	//ms per loop in the run function
	public static int timePerFrame = 1000;
	//number of steps in current simulation
	public static int frames = 0;
	//size of the drawable area
	public static final int canvasWidth=800,canvasHeight=800;
	//area of the grid being displayed
	public static double startTileX=0,startTileY=0;
	public static double offsetX=0,offsetY=0;
	public static double tileSize=0;
	//size of a square in m
	public static int realGridSize=0;
	public static int width=400;
	// top level swing container
	public static MyFrame frame=null;
	public static boolean pause=true;
	public static TurnHandler turnHandler = TurnHandler.getInstance();
	
	
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MainThread());
		t1.start();
	}

	MainThread(){}
	
	public static void LaunchTileUI(ArrayList<Creature> creatures){
		tileSize = (double)canvasWidth/width;
		frame = new MyFrame(canvasWidth,canvasHeight+30);
		grid = new Grid(width);
		grid.addCreatures(creatures);
		turnHandler.setGrid(grid);
	}
	
	@Override
	public void run() {
		 /*
		  * CODE TO BE RUN ONCE AT THE START OF THE PROGRAM
		  */
		OpenMainGameBoard();
		
		CreatureConfiguration window = new CreatureConfiguration();
		window.frame.setVisible(true);
		try {
			/*
			 * CODE TO BE RUN OVER THE LIFE OF THE PROGRAM
			 */
			while(true){
				if (frame!=null){
					while(pause){
						Thread.sleep(1);
						time++;
					}
					if(grid!=null && time%timePerFrame==0){
						grid.step();
						turnHandler.step();
						frames++;
					}
				}
				Thread.sleep(1);
				time++;
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void OpenMainGameBoard(){
		
	}
}