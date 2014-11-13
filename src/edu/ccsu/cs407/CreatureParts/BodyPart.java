package edu.ccsu.cs407.CreatureParts;

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
	protected ArrayList<BodyPart> children;
	protected int health=0;
	public BodyPart(){}
	
	/**
	 * @return the health the BodyPart adds to the animal + the health of all subcomponents
	 */
	public abstract int getHealth();
	
	/**
	 * @param part the BodyPart to be added to a composite BodyPart
	 */
	public abstract void add(BodyPart part);
	
	/**
	 * @param part the BodyPart to be removed from a composite BodyPart
	 */
	public abstract void remove(BodyPart part);
	
	/**
	 * @return an iterator of a type that extends BodyPart on the ArrayList "children"
	 */
	public Iterator<? extends BodyPart> getIterator(){
		return children.iterator();
	}
	
	public String toString(){
		return "Unknown Body Part(" + Integer.toString(health) + ")";
	}
}