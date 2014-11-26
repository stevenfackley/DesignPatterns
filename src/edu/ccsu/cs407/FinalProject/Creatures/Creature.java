package edu.ccsu.cs407.FinalProject.Creatures;


import edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent;
import edu.ccsu.cs407.FinalProject.EatingStrategies.EatingStrategy;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;
import edu.ccsu.cs407.FinalProject.MovementStrategies.MovementStrategy;

/**
 * Creature class outlines a typical creature. Creatures have
 * a name, eating behavior, movement behavior, fighting behavior,
 * a size, a movement speed, can be a cannibal, and can eat larger animals
 * 
 * @author seth
 * @author steve
 * @author dylan
 */

public class Creature extends CompositeCreatureComponent
{
	private EatingStrategy eating;
	private MovementStrategy moving;
	private FightStrategy fighting;
	
	/**
	 * This method determines a standard turn for most animals. It can
	 * be overridden for additional functionality. At the least creatures
	 * must move, fight, and eat.
	 */
	
	public void TakeTurn()
	{
		// Template Method
		Move();
		Fight();
		Eat();
	}
	
	private void Eat()
	{
		eating.Eat();
	}
	
	private void Move()
	{
		moving.Move();
	}
	
	private void Fight()
	{
		fighting.Fight();
	}
	
	
}
