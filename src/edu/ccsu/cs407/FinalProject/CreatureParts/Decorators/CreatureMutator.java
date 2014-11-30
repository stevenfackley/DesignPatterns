package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * This abstract class defines the shell for a 
 * creature decorator. This functionality will
 * be used to mutate creatures. Mutators will 
 * override the method in which it mutates
 * 
 * @author dcruz
 * @author seth
 * @author steve
 */

public abstract class CreatureMutator extends Creature
{	
	protected Creature creature;
	protected int mod;
	
	/**
	 * Constructor
	 * Protected so only inheritors can call it.
	 * 
	 * @param creature to be wrapped
	 * @param integer mutator value
	 */
	protected CreatureMutator(Creature c, int m)
	{
		creature = c;
		mod = m;
	}
	
	/**
	 *  These methods pass the calls the to creature
	 *  that was wrapped
	 */
	public int getHealth()
	{
		return creature.getHealth();
	}

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

	public boolean canEatLarger() 
	{
		return creature.canEatLarger();
	}

	public boolean canSwim() 
	{
		return creature.canSwim();
	}

	public boolean canEatPlants() 
	{
		return creature.canEatPlants();
	}

	public boolean canEatAnimals() 
	{
		return creature.canEatAnimals();
	}

	public boolean canEatSameSpecies() 
	{
		return creature.canEatSameSpecies();
	}

	public void add(CreatureComponent c) 
	{
		creature.add(c);
	}

	public void remove(CreatureComponent c)
	{
		creature.remove(c);
	}

	public CreatureComponent getChild(int i) 
	{
		return creature.getChild(i);
	}
	
	public String toString()
	{
		return creature.toString();
	}
}
