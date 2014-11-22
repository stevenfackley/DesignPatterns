package edu.ccsu.cs407.FinalProject.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Environment.Grid;

public class PlayButton extends JButton implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		MainThread.pause=false;
	}
	public PlayButton(){
		super(">");
		addActionListener(this);
	}
}
