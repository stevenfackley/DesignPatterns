package edu.ccsu.cs407.CreatureParts;

/**
 * A required BodyPart of all animals
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class Head extends LeafBodyPart{
	public Head(){
		super();
		health=20;
	}
	
	public String toString(){
		return "Head(" + Integer.toString(health) + ")";
	}
}
