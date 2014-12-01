package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import java.util.Random;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * This class produces mutated creatures. Implements the
 * singleton and the factory patterns. 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class MutatedCreatureFactory implements MutationFactory 
{
	private static MutatedCreatureFactory instance = null;

	/**
	 * private constructor
	 */
	private MutatedCreatureFactory(){}

	/**
	 * getInstance
	 * returns instance of the factory unless one
	 * already exists.
	 * @return instance
	 */
	public static MutatedCreatureFactory getInstance()
	{
		if (instance == null)
		{
			instance = new MutatedCreatureFactory(); 
		}
		return instance;
	}
	
	/**
	 * factory method
	 * accepts a creature, string, and an integer. 
	 * it parses the string and returns a mutated creature.
	 * @param creature to be wrapped/mutated
	 * @param mutator to be applied
	 * @param amount in which to modify the trait
	 */
	public Creature CreateMutatedCreature(Creature c, int m) 
	{
		Creature creature = c;
		Random randgen = new Random();
		int x = randgen.nextInt(4);
		int mod = randgen.nextInt(2) + 1;
		
		if (x == 0)
		{
			creature = new HealthMutator(creature, randgen.nextInt(2) + mod);
		}
		if (x == 1)
		{
			creature = new SpeedMutator(creature, randgen.nextInt(2) + mod);
		}
		if (x == 2)
		{
			creature = new WeightMutator(creature, randgen.nextInt(2) + mod);
		}
		if (x == 3)
		{
			creature = new DamageMutator(creature, randgen.nextInt(2) + mod);
		} 
		
		return creature;
	}
}
