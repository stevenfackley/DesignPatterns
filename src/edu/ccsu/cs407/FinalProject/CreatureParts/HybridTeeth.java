package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Hyprid Teeth
 * Defines hybrid teeth. Makes animal an omnivore
 * Does 5 damage
 * @author dcruz
 * @author seth
 * @author steven
 */
public class HybridTeeth extends Teeth 
{
	/**
	 * Default Constructor
	 * passes true, true 5
	 */
	public HybridTeeth() 
	{
		super(true, true, 5);
	}


	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#toString()
	 */
	public String toString() {
		return "Hybrid Teeth (Omnivore)";
	}
	
}
