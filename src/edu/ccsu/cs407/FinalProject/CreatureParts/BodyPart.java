package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A BodyPart is a component of an animal, BodyPart
 * contains the health they add to the animal and
 * an ArrayList that stores all subcomponents
 * 
 * @author seth
 * @author dylan
 * @author steve
 */

public abstract class BodyPart{
	
	public BodyPart(){}
	
	/**
	 * @return the health the BodyPart adds to the animal + the health of all subcomponents
	 */
	public abstract int getHealth();
}