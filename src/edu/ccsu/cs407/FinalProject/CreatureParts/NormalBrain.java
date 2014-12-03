package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Normal Brain
 * Defines a normal animal brain. Makes animal not a cannibal. 
 * @author dcruz
 * @author seth
 * @author steven
 */
public class NormalBrain extends Brain 
{
	/**
	 * Constructor
	 * Passes false to Brain indicating
	 * animal is not a cannibal
	 */
	public NormalBrain() {
		super(false);
	}
	
	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.Brain#toString()
	 */
	public String toString(){
		return "Normal Brain (Not a Cannibal)";
	}
}
