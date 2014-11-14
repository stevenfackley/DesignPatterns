package edu.ccsu.cs407.FinalProject;

import edu.ccsu.cs407.FinalProject.CreatureParts.Abdomen;
import edu.ccsu.cs407.FinalProject.CreatureParts.Arms;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Decorators.InjuredDecorator;
import edu.ccsu.cs407.FinalProject.Creatures.ConcreteCreatureFactory;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class Main
{

	public static void main(String[] args) 
	{
		// Get an instance of a creature factory
		ConcreteCreatureFactory factory = ConcreteCreatureFactory.getInstance();
		
		// Make a creature by making a call to the creature factory
		Creature wolf = factory.createCreature("wolf");
		
		// Print the creature
		System.out.println(wolf.toString());
	}
}