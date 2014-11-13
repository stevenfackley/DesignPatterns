package edu.ccsu.cs407.CreatureParts;

/**
 * A BodyPart that increases fighting ability
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class Arms extends LeafBodyPart{
	public Arms(){
		super();
		health = 10;
	}
	
	public String toString(){
		return "Arms(" + Integer.toString(health) + ")";
	}
}
