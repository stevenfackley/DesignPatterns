package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

public class GenerateMapButton extends JButton{
	private static class AListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			MainThread.grid = new Grid(MainThread.width);
			MainThread.width = MainThread.grid.getWidth();
		}
	}
	public GenerateMapButton(){
		super("Generate New World");
		this.addActionListener(new AListener());
	}
}
