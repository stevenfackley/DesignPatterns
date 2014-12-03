package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.Iterator;

/**
 * Null iterator
 * Used where an iterator is not necessary for a composite
 * @author dcruz
 * @author seth
 * @author steven
 *
 */
public class NullIterator implements Iterator
{
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	public Object next(){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext(){
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
