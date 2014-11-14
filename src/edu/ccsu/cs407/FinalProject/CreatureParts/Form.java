package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Every creature has a blank form/body composed of parts like an 
 * abdomen, arms, legs, and a head.
 * @author dcruz
 * @author seth
 * @author Steven
 *
 */

public class Form extends CompositeBodyPart 
{
	protected int getCompositeBaseHealth() 
	{
		return 0;
	}
}
