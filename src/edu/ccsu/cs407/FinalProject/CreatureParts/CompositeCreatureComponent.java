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

public abstract class CompositeCreatureComponent extends CreatureComponent
{
	protected List<CreatureComponent> children = new ArrayList<CreatureComponent>();

/**
 * Add a child body part	
 * @param part
 */
	public void add(CreatureComponent part) 
	{
		children.add(part);	
	}

/**
 * Remove a body part
 * @param part
 */
	public void remove(CreatureComponent part) 
	{
		children.remove(part);		
	}

/**
 * Iterator
 * @return children component iterator
 */
	public Iterator<CreatureComponent> iterator() 
	{
		return children.iterator();
	}
}
