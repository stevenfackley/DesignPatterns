package AnimalComponents;

/**
 * A required BodyPart of all animals
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class Head extends LeafBodyPart{
	public Head(){
		super();
		health=20;
	}
	
	public String toString(){
		return "Head(" + Integer.toString(health) + ")";
	}
}
