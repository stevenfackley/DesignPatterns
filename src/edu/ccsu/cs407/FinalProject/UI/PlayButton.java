package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

/**
 * A button that continues the simulation when pressed
 * @author grunes
 *
 */
public class PlayButton extends JButton implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		MainThread.pause=false;
	}
	/**
	 * Creates the button and adds an action listener
	 */
	public PlayButton(){
		super(">");
		addActionListener(this);
	}
}
