package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * SharpTeeth
 * Defines sharp animal claws. Has damage 7.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class SharpTeeth extends Teeth 
{

	public SharpTeeth() 
	{
		super(false, true, 7);
	}
	
	public String toString()
	{
		return "Sharp Teeth";
	}

}
