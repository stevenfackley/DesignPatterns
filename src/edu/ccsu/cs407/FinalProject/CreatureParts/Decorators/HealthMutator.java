package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * Health Mutator is a concrete implementation of a
 * creture decorator. It wraps a creature inside of it
 * and relies on that creatures implementation for all
 * but the getHealth method where it alters the return.
 * 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class HealthMutator extends CreatureDecorator 
{
	private Creature creature;
	private int healthMod;
	
	
	/**
	 * Constrcutor
	 * accepts a creature c and an int h
	 * h is the integer amount of the health modifier 
	 * being applied to a particular creature.
	 * @param c
	 * @param h
	 */
	public HealthMutator(Creature c, int h) 
	{
		creature = c;
		healthMod = h;
	}
	
	/**
	 * getHealth
	 * modifed getHealth method returns wrapped creatures
	 * health and adds the modifer to it. 
	 */
	public int getHealth()
	{
		return creature.getHealth() + healthMod;
	}

	/**
	 * These methods are implemented to call the 
	 * same respective method on creature since 
	 * these traits arent being mutated. 
	 */
	public int getSpeed() 
	{
		return creature.getSpeed();
	}

	public int getDamage() 
	{
		return creature.getDamage();
	}

	public int getWeight() 
	{
		return creature.getWeight();
	}

	public boolean canFly() 
	{
		return creature.canFly();
	}

	@Override
	public boolean canEatLarger() 
	{
		return creature.canEatLarger();
	}

	@Override
	public boolean canSwim() 
	{
		return creature.canSwim();
	}

	@Override
	public boolean isCarnivore() 
	{
		return creature.isCarnivore();
	}

	@Override
	public boolean isOmnivore() 
	{
		return creature.isOmnivore();
	}

	@Override
	public void add(CreatureComponent c) 
	{
		creature.add(c);
	}

	@Override
	public void remove(CreatureComponent c)
	{
		creature.remove(c);
	}

	@Override
	public CreatureComponent getChild(int i) 
	{
		return creature.getChild(i);
	}
}
