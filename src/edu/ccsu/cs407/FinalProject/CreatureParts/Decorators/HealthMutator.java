package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public class HealthMutator extends CreatureDecorator 
{
	private Creature creature;
	private int healthMod;
	
	public HealthMutator(Creature c, int h) 
	{
		creature = c;
		healthMod = h;
	}
	
	public int getHealth()
	{
		return creature.getHealth() + healthMod;
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
