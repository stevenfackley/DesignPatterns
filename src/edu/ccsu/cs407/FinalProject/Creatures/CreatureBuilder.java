package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
/**
 * Concrete implementation of a creature builder
 * will handle all the creature building in an 
 * organized way. 
 * 
 * @author dcruz
 * @author seth
 * @author steven
 */

public class CreatureBuilder extends AbstractCreatureBuilder {

	@Override
	public Creature buildCreature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTorso(Torso t) {
		torso = t;

	}

	@Override
	public void addHead(Head h) {
		head = h;

	}

	@Override
	public void addLegs(Legs l) {
		legs = l;

	}

}
