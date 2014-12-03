package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents a creatures brain. 
 * Brains toggle the cannibal trait.
 * @author dcruz
 * @author seth
 * @author steve
 */
public abstract class Brain extends CreatureComponent 
{
	private boolean cannibal;
	
	/**
	 * constructor
	 * used by inheritors to set the boolean value
	 * @param c
	 */
	protected Brain(boolean c) {
		cannibal = c;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatSameSpecies()
	 */
	public boolean canEatSameSpecies(){
		return cannibal;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();
}
