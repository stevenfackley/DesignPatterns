package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * FastLegs
 * Defines fast creature legs. Has health 10, weight 5, speed 15.
 * @author dcruz
 * @author seth
 * @author stevenv
 */

public class FastLegs extends Legs 
{
	public FastLegs()
	{
		super(10, 5, 15, 4);
	}

	@Override
	public String toString() 
	{
		return "Fast Legs";
	}
}
