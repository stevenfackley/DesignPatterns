package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Weak Claws
 * Defines weakanimal claws. Has damage 3.
 * @author dcruz
 * @author seth
 * @author steven
 */
public class WeakClaws extends Claws
{

	/**
	 * Default constructor
	 * adds 3 damage
	 */
	public WeakClaws(){
		super(3);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Claws#toString()
	 */
	public String toString() {
		return "Weak Claws";
	}
}
