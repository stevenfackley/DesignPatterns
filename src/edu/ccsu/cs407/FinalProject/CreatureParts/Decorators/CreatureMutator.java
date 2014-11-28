package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Exceptions.UnsupportedOperationException;

/**
 * This abstract class defines the shell for a 
 * creature decorator. This functionality will
 * be used to mutate creatures. This class
 * forces the child decorator to implement all
 * trait methods of creature. 
 * 
 * @author dcruz
 * @author seth
 * @author steve
 */

public abstract class CreatureMutator extends Creature
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
