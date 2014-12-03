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

	/**
	 * Default Constructor
	 * Health 10
	 * Weight 5
	 */
	public SmallTorso(){
		super(10, 5);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Torso#toString()
	 */
	public String toString(){
		return "Small Torso";
	}
}
