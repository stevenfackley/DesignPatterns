package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

public class PauseButton extends JButton implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		MainThread.pause=true;
	}
	public PauseButton(){
		super("||");
		addActionListener(this);
	}
}