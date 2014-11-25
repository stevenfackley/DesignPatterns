package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Torso
 * Composite creature part. Provides structure for other concrete 
 * torso objects. Constructor is protected because only other torsos
 * should have access to the super constructor.
 * 
 * Torso has a name, health stat, and weight stat
 * 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class Torso extends CompositeCreatureComponent 
{
	String name;
	int health;
	int weight;
	
	protected Torso(String n, int h, int w)
	{
		name = n;
		health = h;
		weight = w;
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
		return ("Name: " + name + " Health: " + health + " Weight: " + weight);
	}

}
