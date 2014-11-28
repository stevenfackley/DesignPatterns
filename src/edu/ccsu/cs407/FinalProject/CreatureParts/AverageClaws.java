package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents average creature claws. 
 * Do 5 dmg per attack
 * @author dcruz
 * @author seth
 * @author steve
 */

public class AverageClaws extends Claws 
{

	/**
	 * Constructor
	 * Calls on parents constructor passing in a hard
	 * coded damage statistic.
	 */
	public AverageClaws() 
	{
		super(5);
	}

	/**
	 * To string
	 */
	public String toString()
	{
		return "Average Claws";
	}
}
