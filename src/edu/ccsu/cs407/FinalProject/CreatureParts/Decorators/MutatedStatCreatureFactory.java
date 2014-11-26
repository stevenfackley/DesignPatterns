package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * This class produces mutated creatures. Implements the
 * singleton and the factory patterns. 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class MutatedStatCreatureFactory implements MutatedCreatureFactory 
{
	private static MutatedStatCreatureFactory instance = null;

	/**
	 * private constructor
	 */
	private MutatedStatCreatureFactory(){}

	/**
	 * getInstance
	 * returns instance of the factory unless one
	 * already exists.
	 * @return instance
	 */
	public static MutatedStatCreatureFactory getInstance()
	{
		if (instance == null)
		{
			instance = new MutatedStatCreatureFactory(); 
		}
		return instance;
	}
	
	/**
	 * factory method
	 * accepts a creature, string, and an integer. 
	 * it parses the string and returns a mutated creature.
	 * @param c
	 * @param m
	 * @param x
	 */
	public Creature CreateMutatedCreature(Creature c, String m, int x) 
	{
		Creature creature = c;
		
		if (m.equalsIgnoreCase("health"))
		{
			creature = new HealthMutator(creature, x);
		}
		if (m.equalsIgnoreCase("speed"))
		{
			creature = new SpeedMutator(creature, x);
		}
		
		return creature;
	}
	

}
