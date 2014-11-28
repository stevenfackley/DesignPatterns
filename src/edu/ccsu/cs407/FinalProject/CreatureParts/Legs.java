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
	int health;
	int weight;
	int speed;
	int damage;
	
	protected Legs(int h, int w, int s, int d)
	{
		health = h;
		weight = w;
		speed = s;
		damage = d;
	}
	
	/**
	 * getHealth
	 * @return health
	 */
	public int getHealth()
	{
		return health + super.getHealth();
	}
	
	/**
	 * getWeight
	 * @return weight
	 */
	public int getWeight()
	{
		return weight + super.getWeight();
	}
	
	/**
	 * getSpeed
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed + super.getSpeed();
	}
	
	public int getDamage()
	{
		return damage + super.getDamage();
	}
}