package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Abstract Teeth Class
 * Part of Creature Component
 * @author Steven
 * @author Dylan
 * @author Seth
 *
 */
public abstract class Teeth extends CreatureComponent 
{
	private boolean eatPlants;
	private boolean eatAnimals;
	private int damage;
	
	/**
	 * Default constructor
	 * @param ep eats plants
	 * @param ea eats animals
	 * @param d damage
	 */
	protected Teeth(boolean ep, boolean ea, int d) {
		eatPlants = ep;
		eatAnimals = ea;
		damage = d;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatPlants()
	 */
	public boolean canEatPlants(){
		return eatPlants;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatAnimals()
	 */
	public boolean canEatAnimals(){
		return eatAnimals;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getDamage()
	 */
	public int getDamage(){
		return damage;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();
}
