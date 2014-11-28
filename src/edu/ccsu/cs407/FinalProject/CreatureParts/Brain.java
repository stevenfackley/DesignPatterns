package edu.ccsu.cs407.FinalProject.CreatureParts;

public class Brain extends CreatureComponent 
{
	private boolean cannibal;
	
	protected Brain(boolean c) 
	{
		cannibal = c;
	}
	
	public boolean canEatSameSpecies()
	{
		return cannibal;
	}
}
