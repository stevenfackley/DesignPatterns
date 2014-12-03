package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Large Jaw
 * Defines a large animal jaw. Allows animals to
 * eat larger animals
 * @author dcruz
 * @author seth
 * @author steven
 */
public class LargeJaw extends Jaw
{
	/**
	 * Default Constructor
	 * Can eat larger animals
	 */
	public LargeJaw() {
		super(true);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Jaw#toString()
	 */
	@Override
	public String toString() {
		return "Large Jaw (Eat Larger Animals)";
	}

}
