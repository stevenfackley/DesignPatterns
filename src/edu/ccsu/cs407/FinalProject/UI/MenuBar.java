package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import edu.ccsu.cs407.FinalProject.MainThread;

public class MenuBar extends JPanel{
	public static JTextField resultField= new JTextField("1 FPS        ");
	
	public MenuBar(){
		setMaximumSize(new Dimension(MainThread.canvasWidth, 50));
		//setBackground(Color.GRAY);
		add(new GenerateMapButton());
		add(new PauseButton());
		add(new PlayButton());
		add(new SimulationSpeedSlider());
		add(resultField);
	}
}
