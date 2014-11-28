package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Defines dull teeth for animals.
 * animals with dull tech can eat plants.
 * @author dcruz
 * @author steve
 * @author seth
 */

public class DullTeeth extends Teeth 
{
	public DullTeeth() 
	{
		super(true, false, 3);
	}

	@Override
	public String toString() 
	{
		return "Dull Teeth";
	}
}
