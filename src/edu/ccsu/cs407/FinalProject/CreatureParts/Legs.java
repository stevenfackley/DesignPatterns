package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Legs
 * Composite creature part. Provides structure for other concrete 
 * leg objects. Constructor is protected because only other legs
 * should have access to the super constructor.
 * 
 * Legs have a name, health stat, weight stat, and speed stat
 * 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class Legs extends CompositeCreatureComponent 
{
	String name;
	int health;
	int weight;
	int speed;
	
	public Legs(String n, int h, int w, int s)
	{
		name = n;
		health = h;
		weight = w;
		speed = s;
	}
	
	/**
	 * getHealth
	 * @return health
	 */
	public int getHealth()
	{
		return health;
	}
	
	/**
	 * getWeight
	 * @return weight
	 */
	public int getWeight()
	{
		return weight;
	}
	
	/**
	 * getSpeed
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * getName
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return ("Name: " + name + " Health: " + health + " Weight: " + 
				weight + "Speed: " + speed);
	}
}
