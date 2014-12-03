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

	/**
	 * Default Constructor
	 * Health 30
	 * Weight 15
	 */
	public LargeTorso(){
		super(30, 15);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Torso#toString()
	 */
	@Override
	public String toString() {
		return "Large Torso";
	}
}
