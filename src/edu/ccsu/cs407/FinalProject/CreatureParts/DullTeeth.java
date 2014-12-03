package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Defines dull teeth for animals.
 * animals with dull tech can eat plants.
 * @author dcruz
 * @author steve
 * @author seth
 */

public class DullTeeth extends Teeth{
	/**
	 * Default constructor
	 * Passes true, false, 3 to super
	 */
	public DullTeeth() 
	{
		super(true, false, 3);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#toString()
	 */
	@Override
	public String toString() 
	{
		return "Dull Teeth";
	}
}
