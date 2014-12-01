package edu.ccsu.cs407.FinalProject.UI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 * The main window for the program
 * @author grunes
 *
 */
public class MyFrame extends JFrame {
	/**
	 * constructs the JFrame and sets the starting params
	 * @param width the width of the window
	 * @param height the height of the window
	 */
	public MyFrame(int width,int height){
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		addComponentsToLayout(getContentPane());
		this.setVisible(true);
	}
	/**
	 * Adds the canvas and menu bar to the content pane of the window
	 * @param pane the content pane of the JFrame
	 */
	void addComponentsToLayout(Container pane){
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		add(new MenuBar());
		MyCanvas canvas = new MyCanvas();
		pane.add(canvas);
	}
}