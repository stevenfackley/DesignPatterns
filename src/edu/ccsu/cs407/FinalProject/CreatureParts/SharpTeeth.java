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

	/**
	 * Default constructor
	 * Passes false true 7 to super
	 * 
	 */
	public SharpTeeth() {
		super(false, true, 7);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#toString()
	 */
	public String toString(){
		return "Sharp Teeth";
	}

}
