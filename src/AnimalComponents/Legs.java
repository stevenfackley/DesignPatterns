package AnimalComponents;

/**
 * A BodyPart that increases mobility
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class Legs extends LeafBodyPart{
	public Legs(){
		super();
		health=15;
	}
	
	public String toString(){
		return "Legs(" + Integer.toString(health) + ")";
	}
}
