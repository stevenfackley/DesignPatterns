package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents a giant head object to be 
 * composed on an animal. 
 * 
 * 12 health 8 weight
 * @author dcruz
 * @author seth
 * @author steve
 */

public class GiantHead extends Head 
{
	public GiantHead()
	{
		super(12, 8);
	}

	@Override
	public String toString() 
	{
		return "Giant Head";
	}
}
