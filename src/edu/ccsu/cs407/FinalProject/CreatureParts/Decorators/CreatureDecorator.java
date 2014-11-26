package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.CreatureParts.UnsupportedOperationException;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;

public abstract class CreatureDecorator extends Creature
{	
	public abstract int getHealth();
	public abstract int getSpeed();
	public abstract int getDamage();
	public abstract int getWeight();
	public abstract boolean canFly();
	public abstract boolean canEatLarger(); 
	public abstract boolean canSwim();
	public abstract boolean isCarnivore();
	public abstract boolean isOmnivore(); 
	public abstract void add(CreatureComponent c);
	public abstract void remove(CreatureComponent c);
	public abstract CreatureComponent getChild(int i);
}
