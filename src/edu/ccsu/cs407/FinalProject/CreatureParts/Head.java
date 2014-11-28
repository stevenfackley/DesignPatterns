package edu.ccsu.cs407.FinalProject.CreatureParts;

public abstract class Head extends CompositeCreatureComponent 
{
	private int health;
	private int weight;
	
	protected Head(int h, int w)
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
	
	public abstract String toString();
}
