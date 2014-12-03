package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * FastLegs
 * Defines fast creature legs. Has health 10, weight 5, speed 15.
 * @author dcruz
 * @author seth
 * @author stevenv
 */
public class FastLegs extends Legs 
{
	/**
	 * calls 10,5,15,4 on super
	 */
	public FastLegs(){
		super(10, 5, 15, 4);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Legs#toString()
	 */
	@Override
	public String toString() {
		return "Fast Legs";
	}
}
