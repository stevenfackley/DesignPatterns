package test;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.HealthMutator;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class CreaturePartsTest {

	@Test
	public void test() 
	{
		
		Creature c = new Creature();
		c.add(new LargeTorso());
		c.add(new LargeHead());
		System.out.println(c.getHealth() + "\n" + c.getWeight());
		c = new HealthMutator(c, 20);
		System.out.println(c.getHealth() + "\n" + c.getWeight());
	}
}
