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
	public SlowLegs(){
		super(20, 15, 5, 8);
	}
	
	@Override
	public String toString(){
		return "Slow Legs";
	}
}
