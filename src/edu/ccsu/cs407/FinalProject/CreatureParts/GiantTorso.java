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
	/**
	 * Default Constructor
	 * Health 40
	 * Weight 20
	 */
	public GiantTorso() {
		super(40, 20);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Torso#toString()
	 */
	@Override
	public String toString() 
	{
		return "Giant Torso";
	}
}
