package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

/**
 * HealthMutator
 * modifies a creatures health by wrapping a creature
 * instance.
 * @author dcruz
 * @author seth
 * @author steve
 */

public class HealthMutator extends CreatureMutator 
{	
	/**
	 * Constructor
	 * Passes a creature and integer to the super
	 * constructor
	 * @param creature to be wrapped
	 * @param health modifier
	 */
	public HealthMutator(Creature c, int m) 
	{
		super(c, m);
	}
	
	/**
	 * getHealth
	 * @return creatures health with the added modifier
	 */
	public int getDamage() 
	{
		return creature.getDamage();
	}
	
	public int getHealth() 
	{
		return creature.getHealth() + mod;
	}

	public int getSpeed() 
	{
		return creature.getSpeed();
	}

	public int getWeight() 
	{
		return creature.getWeight();
	}
	
	public String toString()
	{
		String s;
		
		s = this.getName() + "\nHealth: " + this.getHealth() +
			"\nWeight: " + this.getWeight() + "\nSpeed: " + this.getSpeed() +
			"\nDamage: " + this.getDamage() + "\nEat Larger: " + this.canEatLarger() +
			"\nEats Plants: " + this.canEatPlants() + "\nEats Animals " + this.canEatAnimals() + 
			"\nCannibal: " + this.canEatSameSpecies() + "\nFighting Strategy: " + this.getFightStrategy().toString();
		
		return s;
	}
}
