package edu.ccsu.cs407.FinalProject.UI;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import edu.ccsu.cs407.FinalProject.MainThread;

public class SimulationSpeedSlider extends JSlider implements ChangeListener{
	
	public SimulationSpeedSlider(){
		setMajorTickSpacing(5);
		setMinorTickSpacing(1);
		setPaintTicks(true);
		setSnapToTicks(true);
		setMinimum(0);
		setMaximum(20);
		setValue(5);
		addChangeListener(this);
	}
	
	public void stateChanged(ChangeEvent arg0) {
		double fps = Math.pow(10,(getValue()/5.0)-1);
		if(fps>=1)
			MenuBar.resultField.setText((int)(fps) + " FPS");
		else
			MenuBar.resultField.setText(Math.floor((fps*100))/100 + " FPS");
		if(!this.getValueIsAdjusting()){
			MainThread.timePerFrame = (int) (1000/fps);
			System.out.println(fps + " " + MainThread.timePerFrame);
		}
	}
	
	
}
