package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
/**
 * Speed Mutator is a concrete implementation of a
 * creature decorator. It wraps a creature inside of it
 * and relies on that creatures implementation for all
 * but the getSpeed method where it alters the return.
 * 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class SpeedMutator extends CreatureMutator 
{
	private Creature creature;
	private int speedMutator;
	
	
	/**
	 * Constrcutor
	 * accepts a creature c and an int s
	 * s is the integer amount of the speed modifier 
	 * being applied to a particular creature.
	 * @param c
	 * @param h
	 */
	public SpeedMutator(Creature c, int s)
	{
		creature = c;
		speedMutator = s;
	}
	

	/**
	 * getSpeed
	 * modifed getHealth method returns wrapped creatures
	 * speed and adds the modifer to it. 
	 */
	public int getSpeed() 
	{
		return creature.getSpeed() + speedMutator;
	}

	/**
	 * These methods are implemented to call the 
	 * same respective method on creature since 
	 * these traits arent being mutated. 
	 */
	public int getHealth()
	{
		return creature.getHealth();
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

	
	public boolean canEatAnimals() 
	{
		return creature.canEatAnimals();
	}

	
	public boolean canEatPlants() 
	{
		return creature.canEatPlants();
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
