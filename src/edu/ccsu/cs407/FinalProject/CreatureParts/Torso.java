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
	int health;
	int weight;
	
	public Torso(int h, int w)
	{
		health = h;
		weight = w;
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
}
