package edu.ccsu.cs407.FinalProject.Exceptions;

/**
 * Invalid Creature Exception class thrown if the user attempts
 * to create a conrete creature that isnt implemented. 
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class InvalidCreatureException extends Exception 
{
	public InvalidCreatureException()
	{
		super("Invalid Creature Parameter.");
	}
}
