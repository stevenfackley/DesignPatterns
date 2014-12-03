package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Medium Head
 * Defines a medium animal head. Has health 6 and weight 4.
 * @author dcruz
 * @author seth
 * @author steven
 */


public class MediumHead extends Head 
{
	/**
	 * Default Constructor
	 * Health 6
	 * Weight 4
	 */
	public MediumHead(){
		super(6,4);
	}


	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Head#toString()
	 */
	public String toString(){
		return "Medium Head";
	}
}
