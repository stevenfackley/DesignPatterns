package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents a giant head object to be 
 * composed on an animal. 
 * 
 * 12 health 8 weight
 * @author dcruz
 * @author seth
 * @author steve
 */
public class GiantHead extends Head 
{
	/**
	 * Default constructor
	 * Health 12
	 * Weight 8
	 */
	public GiantHead(){
		super(12, 8);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Head#toString()
	 */
	@Override
	public String toString() {
		return "Giant Head";
	}
}
