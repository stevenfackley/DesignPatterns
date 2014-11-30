package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
* DamageMutator
* modifies a creatures damage by wrapping a creature
* instance.
* @author dcruz
* @author seth
* @author steve
*/

public class DamageMutator extends CreatureMutator 
{
	/**
	 * Constructor
	 * Passes a creature and integer to the super
	 * constructor
	 * @param creature to be wrapped
	 * @param damage modifier
	 */
	public DamageMutator(Creature c, int d)
	{
		super(c, d);
	}
	
	/**
	 * getDamage
	 * @return creatures damage with the added modifier
	 */
	public int getDamage() 
	{
		return creature.getDamage() + mod;
	}
}
