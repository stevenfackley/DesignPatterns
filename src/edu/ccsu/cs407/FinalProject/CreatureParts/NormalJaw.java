package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * normal jaw
 * Defines a normal animal jaw. Animals composed with
 * this component cant eat larger animals.
 * @author dcruz
 * @author seth
 * @author steven
 */


public class NormalJaw extends Jaw 
{

	public NormalJaw() 
	{
		super(false);
	}

	@Override
	public String toString() 
	{
		return "Normal Jaw, Cant eat larger animals."; 
	}

}
