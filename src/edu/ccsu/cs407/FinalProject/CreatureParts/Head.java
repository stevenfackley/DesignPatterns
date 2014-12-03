package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Head class
 * @author ackleys
 *
 */
public abstract class Head extends CompositeCreatureComponent 
{
	private int health;
	private int weight;
	
	/**
	 * Default constructor
	 * @param h health
	 * @param w weight
	 */
	protected Head(int h, int w){
		health = h;
		weight = w;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent#getHealth()
	 */
	public int getHealth(){
		return health + super.getHealth();
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent#getWeight()
	 */
	public int getWeight(){
		return weight + super.getWeight();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();
}
