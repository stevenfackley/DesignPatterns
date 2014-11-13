package edu.ccsu.cs407.CreatureParts;

import java.util.Iterator;

/**
 * The main BodyPart of all animals
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */
public class Torso extends CompositeBodyPart{
	public Torso(){
		super();
		health=50;
	}
	
	public String toString(){
		String result = "";
		Iterator<? extends BodyPart> i = this.getIterator();
		while(i.hasNext()){
			result += i.next().toString();
			result += " ";
		}
		return result + "Torso(" + Integer.toString(health) + ")";
	}
}
