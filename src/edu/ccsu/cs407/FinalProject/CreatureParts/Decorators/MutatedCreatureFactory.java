package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class MutatedCreatureFactory implements MutatedFactory 
{
	private static MutatedCreatureFactory instance = null;

	private MutatedCreatureFactory(){}

	public static MutatedCreatureFactory getInstance()
	{
		if (instance == null)
		{
			instance = new MutatedCreatureFactory(); 
		}
		return instance;
	}
	
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
