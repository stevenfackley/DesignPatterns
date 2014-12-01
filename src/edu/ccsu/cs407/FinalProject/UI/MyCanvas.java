package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import edu.ccsu.cs407.FinalProject.MainThread;

public class MyCanvas extends JPanel {
	
	public MyCanvas(){
		setMaximumSize(new Dimension(MainThread.canvasWidth,MainThread.canvasHeight));
		setBackground(Color.WHITE);
		addMouseListener(new MouseInput());
		addMouseMotionListener(new MouseInput());
		this.addMouseWheelListener(new MouseInput());
		
	}
	
	/**
	 * Draws everything to the screen
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//draws the current position of the screen
		if(MainThread.grid!=null){
			MainThread.grid.draw((int)MainThread.startTileX,(int)MainThread.startTileY,(int)MainThread.width,g);
			//draws the selection box if RMB is held
			if(MouseInput.mouseHeld[MouseEvent.BUTTON3]==true && (MouseInput.mouseX-MouseInput.mouseDragStartX)>0 && (MouseInput.mouseY-MouseInput.mouseDragStartY)>0){
				g.setColor(new Color(255,255,255,128));
				g.fillRect(MouseInput.mouseDragStartX, MouseInput.mouseDragStartY, MouseInput.mouseX-MouseInput.mouseDragStartX, MouseInput.mouseY-MouseInput.mouseDragStartY);
				g.setColor(Color.BLACK);
				g.drawRect(MouseInput.mouseDragStartX, MouseInput.mouseDragStartY, MouseInput.mouseX-MouseInput.mouseDragStartX, MouseInput.mouseY-MouseInput.mouseDragStartY);
			}
			//draws the tooltip if RMB is not held
			else{
				paintTooltip(10,10,200,100,g);
			}
		}
		repaint();
	}
	
	private void paintTooltip(int x, int y, int w, int h, Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, w, h);
		g.setColor(Color.BLACK);
		g.drawString("Grid Square: " + Integer.toString(MainThread.realGridSize) + "m",15, 25);
		g.drawString("Plants: " + (int)MainThread.grid.getMouseOver().getPlants()+"/" + (int)MainThread.grid.getMouseOver().getMaxPlants(), 15, 50);
		String CreatureString = "";
		if(MainThread.grid.getMouseOver().getCreature()!=null && MainThread.tileSize>5){
			CreatureString+=MainThread.grid.getMouseOver().getCreature().getName();
			CreatureString+= " "  + (MainThread.grid.getMouseOver().getCreature().getHealth()-MainThread.grid.getMouseOver().getCreature().getDamageTaken());
			CreatureString+= "/"  + MainThread.grid.getMouseOver().getCreature().getHealth();
			g.drawString(CreatureString, 15, 75);
		}
		g.drawString("Time:" + MainThread.time + "ms", 10, 107);
		g.drawString("Frames:" + MainThread.frames, 110, 107);
		
		g.drawRect(10, 10, 200, 100);
		g.drawRect(10, 95, 200, 15);
	}
}