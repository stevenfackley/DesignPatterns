package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

/**
 * A button that pauses the simulation when pressed
 * @author grunes
 *
 */
public class PauseButton extends JButton implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		MainThread.pause=true;
	}
	/**
	 * Creates the button and adds an action listener
	 */
	public PauseButton(){
		super("||");
		addActionListener(this);
	}
}