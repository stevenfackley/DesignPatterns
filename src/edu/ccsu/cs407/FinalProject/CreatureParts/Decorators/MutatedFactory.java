package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public interface MutatedFactory 
{
	public Creature CreateMutatedCreature(Creature c, String m, int x);
}
