package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * SmallTorso
 * Defines a small animal torso. Has health 10 and weight 5.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class SmallTorso extends Torso 
{
	public SmallTorso()
	{
		super(10, 5);
	}
	
	public String toString()
	{
		return "Small Torso";
	}
}
