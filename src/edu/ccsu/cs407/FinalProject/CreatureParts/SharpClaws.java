package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * SharpClaws
 * Defines sharp animal claws. Has damage 10.
 * @author dcruz
 * @author seth
 * @author steven
 */
public class SharpClaws extends Claws 
{
	/**
	 * Default constructor
	 * Add 10 damage
	 */
	public SharpClaws() {
		super(10);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Claws#toString()
	 */
	public String toString(){
		return "Sharp Claws";
	}
}
