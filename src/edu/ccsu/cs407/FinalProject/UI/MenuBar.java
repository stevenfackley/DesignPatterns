package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import edu.ccsu.cs407.FinalProject.MainThread;

public class MenuBar extends JPanel{
	public static JTextField resultField = new JTextField("1 FPS      ");
	public static JTextField gridSizeField = new JTextField(" 400 ");
	
	public MenuBar(){
		setMaximumSize(new Dimension(MainThread.canvasWidth, 30));
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(Box.createRigidArea(new Dimension(50,0)));
		gridSizeField.setMaximumSize(new Dimension(100,30));
		add(gridSizeField);
		add(new GenerateMapButton());
		add(Box.createHorizontalGlue());
		add(new PauseButton());
		add(new PlayButton());
		add(new SimulationSpeedSlider());
		resultField.setMaximumSize(new Dimension(100,30));
		resultField.setEditable(false);
		add(resultField);
		add(Box.createRigidArea(new Dimension(50,0)));
		
	}
}
