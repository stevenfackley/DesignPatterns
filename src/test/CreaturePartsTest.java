package test;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.HealthMutator;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.MutatedCreatureFactory;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.MutationFactory;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class CreaturePartsTest 
{

	@Test
	public void test() 
	{
		Creature c = new Creature();
		
		
		MutationFactory mf = MutatedCreatureFactory.getInstance();
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
		
		c = mf.CreateMutatedCreature(c, 5);
		System.out.println(c.getHealth() + " " + c.getWeight() + " " + c.getSpeed() + " " + c.getDamage());
	}
}
