package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;
/**
 * A JButton that generates a new random grid when pressed
 * @author grunes
 *
 */
public class GenerateMapButton extends JButton{
	/**
	 * When the button is pressed generate a new random grid and
	 * reset the viewing parmeters
	 * @author grunes
	 *
	 */
	private static class AListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			MainThread.grid = new Grid(Integer.parseInt(MenuBar.gridSizeField.getText()));
			MainThread.width = MainThread.grid.getWidth();
			MainThread.startTileX=0;
			MainThread.startTileY=0;
			MainThread.tileSize = (double)MainThread.canvasWidth/MainThread.width;
			MainThread.offsetX = 0;
			MainThread.offsetY = 0;
		}
	}
	/**
	 * Creates the button and adds an action listener
	 */
	public GenerateMapButton(){
		super("Generate New World");
		this.addActionListener(new AListener());
	}
}
