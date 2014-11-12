package AnimalComponents;

import java.util.Iterator;

import edu.ccsu.cs407.FinalProject.Exceptions.InvalidComponentException;

/**
 * A BodyPart that contains no subcomponents
 * throws InvalidComponentException if a method is
 * called to manipulate the ArrayList of subcomponents
 * 
 * @author seth
 * @author dylan
 * @author steve
 */
public class LeafBodyPart extends BodyPart{

	public LeafBodyPart() {
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void add(BodyPart part) {
		try {
			throw new InvalidComponentException();
		} catch (InvalidComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void remove(BodyPart part) {
		try {
			throw new InvalidComponentException();
		} catch (InvalidComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Iterator<? extends BodyPart> getIterator() {
		try {
			throw new InvalidComponentException();
		} catch (InvalidComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
