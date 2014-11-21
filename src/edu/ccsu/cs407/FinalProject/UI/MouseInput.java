package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import edu.ccsu.cs407.FinalProject.MainThread;


public class MouseInput implements MouseListener,MouseMotionListener,MouseWheelListener{
	public static double oldStartTileX;
	public static double oldStartTileY;
	
	public void mouseDragged(MouseEvent e) {
		MainThread.mouseX = e.getX();
		MainThread.mouseY = e.getY();
		if(MainThread.mouseHeld[MouseEvent.BUTTON1]==true && MainThread.width!=MainThread.grid.getWidth()){
			MainThread.startTileX=oldStartTileX-(MainThread.mouseX-MainThread.mouseDragStartX)/MainThread.tileSize;
			MainThread.startTileY=oldStartTileY-(MainThread.mouseY-MainThread.mouseDragStartY)/MainThread.tileSize;
			if(MainThread.startTileX+MainThread.width>=MainThread.grid.getWidth())
				MainThread.startTileX=MainThread.grid.getWidth()-MainThread.width-1;
			else if(MainThread.startTileX<=0)
				MainThread.startTileX=0;
			if(MainThread.startTileY+MainThread.width>=MainThread.grid.getWidth())
				MainThread.startTileY=MainThread.grid.getWidth()-MainThread.width-1;
			else if(MainThread.startTileY<=0)
				MainThread.startTileY=0;
			
			MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
			MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		MainThread.mouseX = e.getX();
		MainThread.mouseY = e.getY();
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

	@Override
	public void mousePressed(MouseEvent e) {
		MainThread.mouseDragStartX=e.getX();
		MainThread.mouseDragStartY=e.getY();
		MainThread.mouseHeld[e.getButton()]=true;
		oldStartTileX = MainThread.startTileX;
		oldStartTileY = MainThread.startTileY;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		MainThread.mouseHeld[e.getButton()]=false;
		if(e.getButton()==MouseEvent.BUTTON3){
			if((MainThread.mouseX-MainThread.mouseDragStartX)>(MainThread.mouseY-MainThread.mouseDragStartY)){
				MainThread.width=(int)((MainThread.mouseX-MainThread.mouseDragStartX)/MainThread.tileSize);
			}
			else
				MainThread.width=(int)((MainThread.mouseY-MainThread.mouseDragStartY)/MainThread.tileSize);
			MainThread.startTileX+=(int)(MainThread.mouseDragStartX/MainThread.tileSize);
			MainThread.startTileY+=(int)(MainThread.mouseDragStartY/MainThread.tileSize);
			MainThread.tileSize = (double)MainThread.canvasWidth/MainThread.width;
			MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
			MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
		}
	}

	@Override
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
		else{
			MainThread.startTileX-=zoom*.5;
			MainThread.startTileY-=zoom*.5;
			if(MainThread.startTileX+MainThread.width>=MainThread.grid.getWidth())
				MainThread.startTileX=MainThread.grid.getWidth()-MainThread.width-1;
			else if(MainThread.startTileX<=0)
				MainThread.startTileX=0;
			if(MainThread.startTileY+MainThread.width>=MainThread.grid.getWidth())
				MainThread.startTileY=MainThread.grid.getWidth()-MainThread.width-1;
			else if(MainThread.startTileY<=0)
				MainThread.startTileY=0;
		}
		MainThread.tileSize = (double)MainThread.canvasWidth/MainThread.width;
		MainThread.offsetX=(MainThread.startTileX-Math.floor(MainThread.startTileX))*MainThread.tileSize;
		MainThread.offsetY=(MainThread.startTileY-Math.floor(MainThread.startTileY))*MainThread.tileSize;
			
	}
	
}
