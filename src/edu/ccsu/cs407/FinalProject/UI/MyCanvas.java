package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.ccsu.cs407.FinalProject.MainThread;

public class MyCanvas extends JPanel {
	
	public MyCanvas(){
		setSize(MainThread.canvasWidth,MainThread.canvasHeight);
		setBackground(Color.WHITE);
		addMouseListener(new MouseInput());
		addMouseMotionListener(new MouseInput());
		this.addMouseWheelListener(new MouseInput());
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		MainThread.grid.draw((int)MainThread.startTileX,(int)MainThread.startTileY,(int)MainThread.width,g);
		if(MainThread.mouseHeld){
			g.setColor(new Color(255,255,255,128));
			g.fillRect(MainThread.mouseDragStartX, MainThread.mouseDragStartY, MainThread.mouseX-MainThread.mouseDragStartX, MainThread.mouseY-MainThread.mouseDragStartY);
			g.setColor(Color.BLACK);
			g.drawRect(MainThread.mouseDragStartX, MainThread.mouseDragStartY, MainThread.mouseX-MainThread.mouseDragStartX, MainThread.mouseY-MainThread.mouseDragStartY);
		}
		repaint();
	}
}