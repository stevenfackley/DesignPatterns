package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * HealthMutator
 * modifies a creatures health by wrapping a creature
 * instance.
 * @author dcruz
 * @author seth
 * @author steve
 */

public class HealthMutator extends CreatureMutator 
{
	
	/**
	 * Constructor
	 * Passes a creature and integer to the super
	 * constructor
	 * @param creature to be wrapped
	 * @param health modifier
	 */
	public HealthMutator(Creature c, int h) 
	{
		super(c, h);
	}
	
	/**
	 * getHealth
	 * @return creatures health with the added modifier
	 */
	public int getHealth()
	{
		return creature.getHealth() + mod;
	}
}
