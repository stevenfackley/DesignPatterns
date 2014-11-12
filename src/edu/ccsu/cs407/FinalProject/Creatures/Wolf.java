package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.Fights.Fights;
import edu.ccsu.cs407.FinalProject.Movements.Walk;

public class Wolf extends Creature
{

	public Wolf()
	{					
		super("Wolf", new Carnivore(), new Walk(), new Fights(), false, true, 5, 5);
	}
}
