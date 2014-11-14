package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A BodyPart that contains at least 1 subcomponent
 * 
 * @author seth
 * @author dylan
 * @author steve
 */

public abstract class CompositeBodyPart extends BodyPart
{
	protected List<BodyPart> children = new ArrayList<BodyPart>();
	public CompositeBodyPart(){}

/**
 * Add a child body part	
 * @param part
 */
	public void add(BodyPart part) 
	{
		children.add(part);	
	}

/**
 * Remove a body part
 * @param part
 */
	public void remove(BodyPart part) 
	{
		children.remove(part);		
	}

/**
 * Iterator
 * @return children component iterator
 */
	public Iterator<BodyPart> iterator() 
	{
		return children.iterator();
	}
	
/**
 * Get the total health of all components as if it were
 * one single component. Implements the template pattern
 * by calling the getCompositeBaseHealth method which
 * is abstract to add the composite objects health
 * and add it to the return.
 * @return componentHealth
 */
	public int getHealth() 
	{
		int componentHealth = getCompositeBaseHealth();
		Iterator<BodyPart> childrenIter = children.iterator();
		
		while (childrenIter.hasNext())
		{
			BodyPart bp = childrenIter.next();
			componentHealth += bp.getHealth();
		}
		
		return componentHealth;
	}
	
	protected abstract int getCompositeBaseHealth();
}
