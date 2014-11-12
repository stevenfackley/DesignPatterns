package edu.ccsu.cs407.FinalProject.Creatures;

/**
 * A class that handles creation of concrete animals
 * in case the user doesnt want to make their own creatures
 * 
 * @author Seth
 * @author Steven
 * @author Dylan
 */

public class ConcreteCreatureFactory 
{
	private static ConcreteCreatureFactory uniqueCreatureFactory = null;
	
	/**
	 * Constructor is private so it can only be called from
	 * inside the class
	 */

	private ConcreteCreatureFactory(){}
	
	/**
	 * getInstance method checks if there is already a creature factory
	 * instantiated. If not it creates one. Then it returns the instance.
	 * 
	 * @return unique singleton creature factory
	 */
	public static ConcreteCreatureFactory getInstance()
	{
		if (uniqueCreatureFactory == null)
		{
			uniqueCreatureFactory = new ConcreteCreatureFactory();
		}
		return uniqueCreatureFactory;
	}
	
	/**
	 * create method accepts a string and creates that type of concrete
	 * creature. If that creature doesnt exist this method will throw an
	 * exception. This is not yet implemented
	 * 
	 * @param s passed in which is checked if it matches a hard coded creature
	 * @return concrete creature
	 */
	public Creature createCreature(String s)
	{
		if (s.equalsIgnoreCase("wolf"))
		{
			return new Wolf();
		}
		else
		{
			return new Monkey();
		}
		
		// TODO: Throw an exception if the creature type doesnt exist. 
	}
}
