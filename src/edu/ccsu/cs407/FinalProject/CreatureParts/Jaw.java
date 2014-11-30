package edu.ccsu.cs407.FinalProject.CreatureParts;

public abstract class Jaw extends CreatureComponent 
{
	private boolean canEatLarger;
	
	protected Jaw(boolean b)
	{
		canEatLarger = b;
	}

	public boolean canEatLarger()
	{
		return canEatLarger;
	}
	
	public String toString(){
		return "Jaw";
	};
}
