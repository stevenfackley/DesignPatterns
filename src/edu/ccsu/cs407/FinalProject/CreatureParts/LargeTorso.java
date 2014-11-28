package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * LargeTorso
 * Defines a large animal torso. Has health 30 and weight 15.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class LargeTorso extends Torso 
{
	public LargeTorso()
	{
		super(30, 15);
	}

	@Override
	public String toString() 
	{
		return "Large Torso";
	}
}
