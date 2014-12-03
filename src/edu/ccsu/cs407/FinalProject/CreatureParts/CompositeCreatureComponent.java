package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite Creature Component Class
 * Defines a creatures component
 * @author Steven 
 * @author Dylan
 * @author Seth
 */
public class CompositeCreatureComponent extends CreatureComponent 
{
	private ArrayList<CreatureComponent> creatureComponents = new ArrayList<CreatureComponent>();
	private Iterator iterator = null;
	
	/**
	 * Gets an iterator
	 * @return Iterator object
	 */
	public Iterator getIterator(){
		if (iterator == null){
			iterator = new CompositeIterator(creatureComponents.iterator());
		}
		return iterator;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#add(edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent)
	 */
	public void add(CreatureComponent c){
		creatureComponents.add(c);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#remove(edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent)
	 */
	public void remove(CreatureComponent c){
		creatureComponents.remove(c);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getChild(int)
	 */
	public CreatureComponent getChild(int i){
		return creatureComponents.get(i);
	}
	
	/**
	 * Gets a list of current creature components
	 * @return Array List of creature components
	 */
	public ArrayList<CreatureComponent> getCreatureComponents(){
		return creatureComponents;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getHealth()
	 */
	public int getHealth(){
		int health = 0;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
				try {
					health += creatureComponent.getHealth();
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return health;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getSpeed()
	 */
	public int getSpeed(){
		int speed = 0;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					speed += creatureComponent.getSpeed();
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		
		return speed;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getWeight()
	 */
	public int getWeight(){
		int weight = 0;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					weight += creatureComponent.getWeight();
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return weight;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#getDamage()
	 */
	public int getDamage(){
		int damage = 0;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					damage += creatureComponent.getDamage();
				} 
				catch (UnsupportedOperationException e) {
				
				}
		}
		return damage;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canFly()
	 */
	public boolean canFly()
	{
		boolean fly = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					fly = creatureComponent.canFly() ? true:fly;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return fly;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canSwim()
	 */
	public boolean canSwim(){
		boolean swim= false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					swim = creatureComponent.canSwim() ? true : swim;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return swim;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatLarger()
	 */
	public boolean canEatLarger(){
		boolean larger = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					larger = creatureComponent.canEatLarger() ? true : larger;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return larger;
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatPlants()
	 */
	public boolean canEatPlants(){
		boolean omni = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
				try {		
					omni = creatureComponent.canEatPlants() ? true : omni;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return omni;
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatAnimals()
	 */
	public boolean canEatAnimals(){
		boolean carn = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {
					carn = creatureComponent.canEatAnimals() ? true : carn;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return carn;
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatSameSpecies()
	 */
	public boolean canEatSameSpecies(){
		boolean cannibal = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext()){
			CreatureComponent creatureComponent = iterator.next();
		
				try {			
					cannibal = creatureComponent.canEatAnimals() ? true : cannibal;
				} 
				catch (UnsupportedOperationException e) {
					
				}
		}
		return cannibal;
	}
}
