package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * SlowLegs
 * Defines slow creature legs. Has health 20, weight 15, speed 5.
 * @author dcruz
 * @author seth
 * @author steven 
 */
public class SlowLegs extends Legs 
{
	/**
	 * calls 20,15,5,8 on super
	 */
	public SlowLegs(){
		super(20, 15, 5, 8);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Legs#toString()
	 */
	@Override
	public String toString(){
		return "Slow Legs";
	}
}
