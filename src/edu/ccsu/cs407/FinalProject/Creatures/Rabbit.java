package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.Fights.RunAway;
import edu.ccsu.cs407.FinalProject.Movements.Walk;

/**
 * This class defines a concrete creature the rabbit.
 * Rabbits override the TakeTurn method and adds a hiding action
 * because rabbits can dig holes to avoid hunters.
 * 
 * @author dcruz
 * @author steven
 * @author seth
 */

public class Rabbit extends Creature
{

	public Rabbit()
	{			
		super("Rabbit", new Herbivore(), new Walk(), new RunAway(), false, false, 3, 7);
	} 
	
	
	/**
	 * Rabbits have a chance of hiding at the end of their turn.
	 */
	private void Hide()
	{
		// Rabbits have a chance to dig holes to hide in at the end of their turn. 
	}
	
	/**
	 * Overridden to add the hide method to the rabbits turn.
	 */
	public void TakeTurn()
	{
		super.TakeTurn();
		Hide();
	}
}
