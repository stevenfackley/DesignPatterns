package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * GiantTorso
 * Defines a giant animal torso. Has health 40 and weight 20.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class GiantTorso extends Torso 
{
	protected GiantTorso() 
	{
		super(40, 20);
	}

	@Override
	public String toString() 
	{
		return "Giant Torso";
	}
}
