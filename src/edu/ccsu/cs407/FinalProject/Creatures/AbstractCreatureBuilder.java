package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;

/**
 * Represents a shell of a creature builder. this class
 * will handle the building of creatures. Adding components
 * appropriately. 
 * @author dcruz
 * @author seth
 * @author steven
 */

public abstract class AbstractCreatureBuilder 
{
	protected Torso torso;
	protected Head head;
	protected Legs legs;
	
	public Creature buildCreature(){
		Creature creature = new Creature();
		if (head != null)
			creature.add(head);
		if (torso != null)
			creature.add(torso);
		if (legs != null)
			creature.add(legs);
		return creature;
	};
	public abstract void addTorso(Torso t);
	public abstract void addHead(Head h);
	public abstract void addLegs(Legs l);
}
