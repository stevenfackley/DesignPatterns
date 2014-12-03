package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents creature claws. 
 * Claws modify the damage stat
 * @author dcruz
 * @author seth
 * @author steve
 */

public abstract class Claws extends CreatureComponent 
{
	private int damage;
	
	/**
	 * Constructor
	 * used by inheritors to pass in a damage stat
	 * @param d
	 */
	protected Claws(int d) {
		damage = d;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getDamage()
	 */
	public int getDamage(){
		return damage;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();
}
