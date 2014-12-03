package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * AverageLegs
 * Defines average creature legs. Has health 15, weight 10, speed 10.
 * @author dcruz
 * @author seth
 * @author steven 
 */

public class AverageLegs extends Legs 
{
	/**
	 * calls 15, 10, 10, 6 on super
	 */
	public AverageLegs(){
		super(15, 10, 10, 6);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Legs#toString()
	 */
	@Override
	public String toString() {
		return "Average Legs";
	}
}
