package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;

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
	public abstract int getHealth();
	public abstract int getSpeed();
	public abstract int getDamage();
	public abstract int getWeight();
	
	public void Fight()
	{
		creature.Fight(); 
	}
	
	public String getName()
	{
		return creature.getName();
	}
	
	public void setName(String s)
	{
		creature.setName(s);
	}
	
	public void setFightStrategy(FightStrategy f)
	{
		creature.setFightStrategy(f);
	}
	
	public FightStrategy getFightStrategy()
	{
		return creature.getFightStrategy();
	}
	
	public void setPosition(int x,int y)
	{
		creature.setPosition(x, y);
	}
	
	public int getX()
	{
		return creature.getX();
	}
	
	public int getY()
	{
		return creature.getY();
	}
	
	public void takeDamage(int damage)
	{
		creature.takeDamage(damage);
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
	
	public int getDamageTaken()
	{
		return creature.getDamageTaken();
	}
	
	public abstract String toString();
}
