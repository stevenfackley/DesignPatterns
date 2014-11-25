package edu.ccsu.cs407.FinalProject.Creatures;


import java.text.Normalizer.Form;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
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

public class Creature extends CreatureComponent
{
	private String name;
	private EatingStrategy eating;
	private MovementStrategy moving;
	private FightStrategy fighting;

	/**
	 * Constructor for creating creatures.
	 * 
	 * @param n			name of the creature
	 * @param eats		eating strategy of creature
	 * @param moves		movement strategy
	 * @param fights	fighting strategy
	 * @param cannibal	boolean to determine if its a cannibal
	 * @param eatBig	boolean to determine if it can eat larger animals
	 * @param s			integer defining creatures size
	 * @param ms		integer defining creatures movement speed
	 */
	public Creature(String n)
	{
		name = n;
	}
	
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
