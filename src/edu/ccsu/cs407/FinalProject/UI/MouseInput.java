package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import edu.ccsu.cs407.FinalProject.MainThread;


public class MouseInput implements MouseListener,MouseMotionListener,MouseWheelListener{
	public static double oldStartTileX, oldStartTileY;
	//mouse info
	public static int mouseX=0,mouseY=0;
	public static int mouseDragStartX=0, mouseDragStartY=0;
	public static boolean mouseHeld[]= new boolean[16];
	
	/**
	 * Position of the mouse if a mouse button is held down.
	 * Pans the grid if LMB is held.
	 */
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		checkMouseBounds();
		if(mouseHeld[MouseEvent.BUTTON1]==true && MainThread.width!=MainThread.grid.getWidth()){
			MainThread.startTileX=oldStartTileX-(mouseX-mouseDragStartX)/MainThread.tileSize;
			MainThread.startTileY=oldStartTileY-(mouseY-mouseDragStartY)/MainThread.tileSize;
			checkBounds();
			MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
			MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
		}
	}
	/**
	 * Triggers in the mouse is moved
	 * Position of the mouse if nothing is clicked
	 */
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		checkMouseBounds();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Triggers when a mouse button is pressed.
	 * Stores the position of the mouse and grid at this time.
	 */
	public void mousePressed(MouseEvent e) {
		mouseDragStartX=e.getX();
		mouseDragStartY=e.getY();
		mouseHeld[e.getButton()]=true;
		oldStartTileX = MainThread.startTileX;
		oldStartTileY = MainThread.startTileY;
	}

	/**
	 * Triggers when a mouse button is released.
	 * Resolves the current selection zoom if RMB was pressed.
	 */
	public void mouseReleased(MouseEvent e) {
		mouseHeld[e.getButton()]=false;
		if(e.getButton()==MouseEvent.BUTTON3){
			int newWidth = 0;
			if((mouseX-mouseDragStartX)>(mouseY-mouseDragStartY)){
				newWidth=(int)((mouseX-mouseDragStartX)/MainThread.tileSize);
			}
			else
				newWidth=(int)((mouseY-mouseDragStartY)/MainThread.tileSize);
			if(newWidth>10 && (mouseX-mouseDragStartX)>0 && (mouseY-mouseDragStartY)>0){
				MainThread.width=newWidth;
				MainThread.startTileX+=(int)(mouseDragStartX/MainThread.tileSize);
				MainThread.startTileY+=(int)(mouseDragStartY/MainThread.tileSize);
				checkBounds();
				MainThread.tileSize = (double)MainThread.canvasWidth/MainThread.width;
				MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
				MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
			}
		}
	}

	/**
	 * Triggers when the mouse wheel is scrolled.
	 * Zooms the grid in or out.
	 */
	public void mouseWheelMoved(MouseWheelEvent e) {
		int zoom = e.getWheelRotation()*(MainThread.width/33+1);
		if(zoom<0 && MainThread.width==1)
			zoom=0;
		MainThread.width+=zoom;
		if(MainThread.width>MainThread.grid.getWidth()){
			MainThread.width=MainThread.grid.getWidth();
			MainThread.startTileX=0;
			MainThread.startTileY=0;
		}
		else if(MainThread.width>10){
			MainThread.startTileX-=zoom*.5;
			MainThread.startTileY-=zoom*.5;
			checkBounds();
		}
		else
			MainThread.width-=zoom;
		MainThread.tileSize = (double)MainThread.canvasWidth/MainThread.width;
		MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
		MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
			
	}
	/**
	 * Checks to see if the current visable grid is within the overall grid, if not: corrects the error
	 */
	private static void checkBounds(){
	if(MainThread.startTileX+MainThread.width>=MainThread.grid.getWidth())
		MainThread.startTileX=MainThread.grid.getWidth()-MainThread.width-1;
	else if(MainThread.startTileX<=0)
		MainThread.startTileX=0;
	if(MainThread.startTileY+MainThread.width>=MainThread.grid.getWidth())
		MainThread.startTileY=MainThread.grid.getWidth()-MainThread.width-1;
	else if(MainThread.startTileY<=0)
		MainThread.startTileY=0;
	}
	/**
	 * Checks to see if the mouse is on the canvas and moves it to the edge of the canvas if it isnt
	 */
	private static void checkMouseBounds(){
	if(mouseX>MainThread.canvasWidth)
		mouseX=MainThread.canvasWidth;
	else if(mouseX<0)
		mouseX=0;
	if(mouseY>MainThread.canvasWidth)
		mouseY=MainThread.canvasWidth;
	else if(mouseY<0)
		mouseY=0;
	}
}
