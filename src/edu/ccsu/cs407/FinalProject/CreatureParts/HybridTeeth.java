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
	public HybridTeeth() 
	{
		super(true, true, 5);
	}


	public String toString() 
	{
		return "Hybrid Teeth (Omnivore)";
	}
	
}
