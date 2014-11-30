package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * WeightMutator
 * modifies a creatures weight by wrapping a creature
 * instance.
 * @author dcruz
 * @author seth
 * @author steve
 */

public class WeightMutator extends CreatureMutator 
{
	/**
	 * Constructor
	 * Passes a creature and integer to the super
	 * constructor
	 * @param creature to be wrapped
	 * @param weight modifier
	 */
	public WeightMutator(Creature c, int w)
	{
		super(c, w);
	}

	/**
	 * getWeight
	 * @return creatures weight with the added modifier
	 */
	public int getWeight() 
	{
		return creature.getWeight() + mod;
	}
}
