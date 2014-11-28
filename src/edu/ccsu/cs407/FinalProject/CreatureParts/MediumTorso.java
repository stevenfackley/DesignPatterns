package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * MediumTorso
 * Defines a medium animal torso. Has health 20 and weight 10.
 * @author dcruz
 * @author seth
 * @author steven
 */

public class MediumTorso extends Torso 
{
	public MediumTorso(){
		super(20, 10);
	}
	
	@Override
	public String toString(){
		return "Medium Torso";
	}
}
