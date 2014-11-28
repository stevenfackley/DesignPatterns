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
	protected Claws(int d) 
	{
		damage = d;
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	public abstract String toString();
}
