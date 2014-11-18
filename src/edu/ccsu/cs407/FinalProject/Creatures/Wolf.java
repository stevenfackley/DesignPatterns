package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.EatingStrategies.Carnivore;
import edu.ccsu.cs407.FinalProject.FightStrategies.Fights;
import edu.ccsu.cs407.FinalProject.MovementStrategies.Walk;

public class Wolf extends Creature
{

	public Wolf()
	{
		super("Wolf", new Carnivore(), new Walk(), new Fights(), false, true, 5, 5);
	}
}
