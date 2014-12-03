package edu.ccsu.cs407.FinalProject.CreatureParts;

/**
 * Creature Jaw Class
 * @author ackleys
 * 
 *
 */
public abstract class Jaw extends CreatureComponent 
{
	private boolean canEatLarger;
	
	/**
	 * Default Constructor
	 * @param b caneat larger
	 */
	protected Jaw(boolean b){
		canEatLarger = b;
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent#canEatLarger()
	 */
	public boolean canEatLarger(){
		return canEatLarger;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Jaw";
	};
}
