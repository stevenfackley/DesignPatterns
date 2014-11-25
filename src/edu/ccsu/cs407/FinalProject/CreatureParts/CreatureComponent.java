package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.Iterator;

/**
 * Abstract class to provide interface for creature components
 * 
 * @author seth
 * @author dylan
 * @author steve
 */

public abstract class CreatureComponent
{
	
	/**
	 * Add
	 * Adds a creaturecomponent to a composite component. 
	 * Only implemented by a composite componenet.
	 * @param c
	 * @throws UnsupportedOperationException
	 */
	public void add(CreatureComponent c) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Remove
	 * Removes a creaturecomponent from a composite component
	 * @param c
	 * @throws UnsupportedOperationException
	 */
	public void remove(CreatureComponent c) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * getChild
	 * @param i
	 * @return creaturecomponent at that index
	 * @throws UnsupportedOperationException
	 */
	public CreatureComponent getChild(int i) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * The following methods return statistics of the component. 
	 * Not all components implement every method so all methods 
	 * throw an unsupported operation exception.
	 */
	
	/**
	 * getHealth
	 * @return the health the component
	 * @throws UnsupportedOperationException 
	 */
	public int getHealth() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * getSpeed
	 * @return speed of the component
	 * @throws UnsupportedOperationException
	 */
	public int getSpeed() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * getWeight
	 * @return weight of component
	 * @throws UnsupportedOperationException
	 */
	public int getWeight() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * getDamage
	 * @return damage of component
	 * @throws UnsupportedOperationException
	 */
	public int getDamage() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * canFly
	 * @return boolean true if component provides flight
	 * @throws UnsupportedOperationException
	 */
	public boolean canFly() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * canSwim
	 * @return boolean true if component provides ability to swim
	 * @throws UnsupportedOperationException
	 */
	public boolean canSwim() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * canEatLarger
	 * @return true if part provides ability to eat larger animals
	 * @throws UnsupportedOperationException
	 */
	public boolean canEatLarger() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * isOmnivore
	 * @return true if omnivore
	 * @throws UnsupportedOperationException
	 */
	public boolean isOmnivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * isHerbivore
	 * @return true if herbivore
	 * @throws UnsupportedOperationException
	 */
	public boolean isHerbivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * isCarnivore
	 * @return true if carnivore
	 * @throws UnsupportedOperationException
	 */
	public boolean isCarnivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
}