package edu.ccsu.cs407.FinalProject.CreatureParts;

public class Claws extends CreatureComponent 
{
	private int damage;
	
	protected Claws(int d) 
	{
		damage = d;
	}
	
	public int getDamage()
	{
		return damage;
	}
}
