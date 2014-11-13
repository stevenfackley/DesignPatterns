package edu.ccsu.cs407.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A BodyPart that contains at least 1 subcomponent
 * 
 * @author seth
 * @author dylan
 * @author steve
 */
public class CompositeBodyPart extends BodyPart{

	public CompositeBodyPart() {
		children = new ArrayList<BodyPart>();
	}

	@Override
	public int getHealth() {
		Iterator<? extends BodyPart> i = this.getIterator();
		int total = 0;
		while(i.hasNext()){
			total+=i.next().getHealth();
		}
		return total+health;
	}

	@Override
	public void add(BodyPart part) {
		children.add(part);
		
	}

	@Override
	public void remove(BodyPart part) {
		children.remove(part);		
	}

	@Override
	public Iterator<? extends BodyPart> getIterator() {
		return children.iterator();
	}
	
	public String toString(){
		String result = "";
		Iterator<? extends BodyPart> i = this.getIterator();
		while(i.hasNext()){
			result += i.next().toString();
			result += " ";
		}
		return result + "Unknown Body Part(" + Integer.toString(health) + ")";
	}
}
