package edu.ccsu.cs407.FinalProject.Creatures;


import edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;

/**
 * Creature class outlines a typical creature. Creatures have
 * a name, eating behavior, movement behavior, fighting behavior,
 * a size, a movement speed, can be a cannibal, and can eat larger animals
 * 
 * @author seth
 * @author steve
 * @author dylan
 */

public class Creature extends CompositeCreatureComponent implements Cloneable
{
	private FightStrategy fighting;
	private String name;
	
	public Creature()
	{}
	
	public Creature(String n, FightStrategy f)
	{
		fighting = f;
		name = n;
	}
	
	public void Fight()
	{
		fighting.Fight(); 
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setFightStrategy(FightStrategy f)
	{
		fighting = f;
	}
	
	@Override
	public String toString()
	{
		String s;
		
		s = name + "\nHealth: " + this.getHealth() +
			"\nWeight: " + this.getWeight() + "\nSpeed: " + this.getSpeed() +
			"\nDamage: " + this.getDamage() + "\nEat Larger: " + this.canEatLarger() +
			"\nEats Plants: " + this.canEatPlants() + "\nEats Animals " + this.canEatAnimals() + 
			"\nCannibal: " + this.canEatSameSpecies() + "\nFighting Strategy: " + fighting.toString();
		
		return s;
	}
	
	@Override
	public Creature clone()
	{
	    Creature creature = this;
	  

	    return creature;
	}
}
