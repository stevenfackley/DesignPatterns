package test;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.Creatures.Rabbit;
import edu.ccsu.cs407.FinalProject.Creatures.Wolf;

public class CreaturePartsTest 
{

	@Test
	public void test() 
	{
		Wolf w = new Wolf();
		System.out.println(w.toString());
		
		Rabbit r = new Rabbit();
		System.out.println(r.toString());
	}
}
