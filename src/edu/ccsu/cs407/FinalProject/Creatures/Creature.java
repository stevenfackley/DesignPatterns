package edu.ccsu.cs407.FinalProject.Creatures;


import java.util.Iterator;

import edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent;
import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
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
	private int posX = 0;
	private int posY = 0;
	private int damageTaken = 0;
	
	public Creature(){}
	
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
	
	public FightStrategy getFightStrategy()
	{
		return fighting;
	}
	
	public void setPosition(int x,int y){
		posX=x;
		posY=y;
	}
	
	public int getX()
	{
		return posX;
	}
	
	public int getY()
	{
		return posY;
	}
	
	public void takeDamage(int damage)
	{
		damageTaken+=damage;
	}
	
	public int getDamageTaken()
	{
		return damageTaken;
	}
	
	public String toString()
	{
		String s;
		
		s = name + "\nHealth: " + getHealth() +
			"\nWeight: " + getWeight() + "\nSpeed: " + getSpeed() +
			"\nDamage: " + getDamage() + "\nEat Larger: " + canEatLarger() +
			"\nEats Plants: " + canEatPlants() + "\nEats Animals " + canEatAnimals() + 
			"\nCannibal: " + canEatSameSpecies() + "\nFighting Strategy: " + fighting.toString();
		
		return s;
	}
	
	public Creature clone()
	{
	    Creature creature = new Creature();
	    
	    //set name on clone
	    creature.setName(getName());
	    
	    //set fighting strategy
	    creature.setFightStrategy(getFightStrategy());
	    
	    //set taken damage
	    creature.takeDamage(getDamageTaken());
	    
	    //set body parts
	    for (CreatureComponent component : this.getCreatureComponents())
	    {
	    	creature.add(component);
	    }
	   
	    return creature;
	}
}
