package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * A BodyPart is a component of an animal, BodyPart
 * contains the health they add to the animal and
 * an ArrayList that stores all subcomponents
 * 
 * @author seth
 * @author dylan
 * @author steve
 */

public abstract class CreatureComponent
{
	/**
	 * The following methods return statistics of the component. 
	 * Not all components implement every method so all methods 
	 * throw an unsupported operation exception.
	 */
	
	/**
	 * getName
	 * @return the name of the the component
	 * @throws UnsupportedOperationException 
	 */
	public String getName() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
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
	
	public int getDamage() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean canFly() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean canSwim() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean isOmnivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean isHerbivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean isCarnivore() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	public abstract String toString();
}