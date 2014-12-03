package edu.ccsu.cs407.FinalProject.Exceptions;
/**
 * Unsupported Operation Exception class thrown if the user attempts
 * an operation not supported
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */
public class UnsupportedOperationException extends Exception 
{
	
	/**
	 * Throws the exception
	 */
	public UnsupportedOperationException(){
		super("This is an unsupported operation.");
	}
	
	/**
	 * Throws an exception with custom message
	 * @param message
	 */
	public UnsupportedOperationException(String message){
		super(message);
	}
}
