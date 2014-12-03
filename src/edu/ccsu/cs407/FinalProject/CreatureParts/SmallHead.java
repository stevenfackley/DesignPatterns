package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Small Head
 * Defines ssmall animal head. Has health 3 and weight 2.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class SmallHead extends Head 
{
	/**
	 * Default constructor
	 * Health 3 
	 * Weight 2
	 */
	public SmallHead(){
		super(3, 2);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Head#toString()
	 */
	public String toString() {
		return "Small Head";
	}
}
