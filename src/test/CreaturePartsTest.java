package test;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.DamageMutator;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.HealthMutator;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.MutatedCreatureFactory;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.SpeedMutator;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.WeightMutator;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Creatures.Wolf;

public class CreaturePartsTest 
{

	@Test
	public void test() 
	{
		Creature w = new Wolf();
		System.out.println(w.toString());
		MutatedCreatureFactory mcf = MutatedCreatureFactory.getInstance();
		System.out.println(w.toString());
		
	}
}