package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.Iterator;
import java.util.Stack;

/**
 * defines an iterator that will iterate through
 * a composite creature structure. 
 * @author dcruz
 *
 */

public class CompositeIterator implements Iterator
{
	Stack stack = new Stack();
	
	/**
	 * @param iterator
	 */
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	public Object next(){
		if (hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			CreatureComponent component = (CreatureComponent) iterator.next();
			if (component instanceof CompositeCreatureComponent)
			{
				stack.push(component.createIterator());
			}
			return component;
		}
		else 
		{
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext(){
		if (stack.empty()){
			return false;
		}
		else{
			Iterator iterator = (Iterator) stack.peek();
			if( !iterator.hasNext()){
				stack.pop();
				return hasNext();
			}
			else{
				return true;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
