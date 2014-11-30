package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * SpeedMutator
 * modifies a creatures speed by wrapping a creature
 * instance.
 * @author dcruz
 * @author seth
 * @author steve
 */

public class SpeedMutator extends CreatureMutator 
{	
	/**
	 * Constructor
	 * Passes a creature and integer to the super
	 * constructor
	 * @param creature to be wrapped
	 * @param speed modifier
	 */
	public SpeedMutator(Creature c, int s)
	{
		super(c, s);
	}
	

	/**
	 * getSpeed
	 * @return creatures speed with the added modifier
	 */
	public int getSpeed() 
	{
		return creature.getSpeed() + mod;
	}
}
