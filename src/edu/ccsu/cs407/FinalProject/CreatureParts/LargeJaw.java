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
	public LargeJaw() 
	{
		super(true);
	}

	@Override
	public String toString() 
	{
		return "Large Jaw (Eat Larger Animals)";
	}

}
