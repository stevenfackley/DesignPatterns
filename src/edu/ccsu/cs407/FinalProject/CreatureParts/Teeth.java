package edu.ccsu.cs407.FinalProject.CreatureParts;

public class Teeth extends CreatureComponent 
{
	private boolean eatPlants;
	private boolean eatAnimals;
	private int damage;
	
	protected Teeth(boolean ep, boolean ea, int d) 
	{
		eatPlants = ep;
		eatAnimals = ea;
		damage = d;
	}
	
	public boolean canEatPlants()
	{
		return eatPlants;
	}
	
	public boolean canEatAnimals()
	{
		return eatAnimals;
	}
	
	public int getDamage()
	{
		return damage;
	}
}
