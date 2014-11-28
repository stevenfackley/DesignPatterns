package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Represents a crazed brain. This toggles animal as a cannibal
 * damn team killers...
 * @author dcruz
 *
 */

public class CrazedBrain extends Brain 
{
	/**
	 * Constructor
	 * passes true to the super constructor
	 * defining the animal its composed with as a cannibal
	 */
	
	public CrazedBrain() 
	{
		super(true);
	}

	@Override
	public String toString() 
	{
		return "Crazed Brain (Cannibalism)";
	}
}
