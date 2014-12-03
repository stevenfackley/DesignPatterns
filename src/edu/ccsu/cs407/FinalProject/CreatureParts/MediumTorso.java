package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * MediumTorso
 * Defines a medium animal torso. Has health 20 and weight 10.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class MediumTorso extends Torso 
{
	/**
	 * Default constructor
	 * Health 20
	 * Weight 10
	 */
	public MediumTorso(){
		super(20, 10);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Torso#toString()
	 */
	public String toString(){
		return "Medium Torso";
	}
}
