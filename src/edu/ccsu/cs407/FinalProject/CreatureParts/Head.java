package edu.ccsu.cs407.FinalProject.CreatureParts;

public class Head extends CompositeCreatureComponent 
{
	int health;
	int weight;
	
	public Head(int h, int w)
	{
		health = h;
		weight = w;
	}
	
	public int getHealth()
	{
		return health + super.getHealth();
	}
	
	public int getWeight()
	{
		return weight + super.getWeight();
	}
}
