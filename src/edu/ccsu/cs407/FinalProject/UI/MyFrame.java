package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MyFrame extends JFrame {		
	public MyFrame(int width,int height){
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		addComponentsToLayout(getContentPane());
		setVisible(true);
	}
	
	void addComponentsToLayout(Container pane){
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		pane.add(new MenuBar());
		MyCanvas canvas = new MyCanvas();
		pane.add(canvas);
	}
}