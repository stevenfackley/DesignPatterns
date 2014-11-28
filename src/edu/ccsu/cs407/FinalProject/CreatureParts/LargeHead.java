package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * LargeHead
 * Defines a large animal head. Has health 9 and weight 6.
 * @author dcruz
 * @author seth
 * @author steven
 */


public class LargeHead extends Head 
{
	public LargeHead()
	{
		super(9,6);
	}

	@Override
	public String toString() 
	{
		return "Large Head";
	}
}
