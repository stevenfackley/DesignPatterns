package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class SpeedMutator extends CreatureDecorator 
{
	private Creature creature;
	private int speedMutator;
	
	public SpeedMutator(Creature c, int s)
	{
		creature = c;
		speedMutator = s;
	}
	
	public int getHealth()
	{
		return creature.getHealth();
	}

	public int getSpeed() 
	{
		return creature.getSpeed() + speedMutator;
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

	
	public boolean isCarnivore() 
	{
		return creature.isCarnivore();
	}

	
	public boolean isOmnivore() 
	{
		return creature.isOmnivore();
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
}
