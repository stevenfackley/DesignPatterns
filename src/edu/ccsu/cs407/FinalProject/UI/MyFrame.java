package edu.ccsu.cs407.FinalProject.UI;

import javax.swing.JFrame;

public class MyFrame extends JFrame {		
	public MyFrame(int width,int height){
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		MyCanvas canvas = new MyCanvas();
		this.add(canvas);
		canvas.paintComponent(this.getGraphics());
	}
}