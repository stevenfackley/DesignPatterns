package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Normal Brain
 * Defines a normal animal brain. Makes animal not a cannibal. 
 * @author dcruz
 * @author seth
 * @author steven
 */


public class NormalBrain extends Brain 
{
	public NormalBrain() 
	{
		super(false);
	}
	
	public String toString()
	{
		return "Normal Brain (Not a Cannibal)";
	}
}
