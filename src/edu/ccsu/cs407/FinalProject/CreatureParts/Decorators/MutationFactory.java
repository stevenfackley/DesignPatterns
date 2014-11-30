package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * interface defining the shell for a
 * mutated creature factory
 * @author dcruz
 * @author seth
 * @author steven
 */

public interface MutationFactory 
{
	public Creature CreateMutatedCreature(Creature c, int x);
}
