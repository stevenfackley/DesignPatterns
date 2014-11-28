package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.*;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;

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
	protected Brain brain;
	protected Claws claws;
	protected Teeth teeth;
	protected Jaw jaw;
	protected String name;
	protected FightStrategy fightStrategy;
	
	public Creature buildCreature(){
		Creature creature = new Creature();
		if (name != null)
			creature.setName(name);
		if (fightStrategy != null)
			creature.setFightStrategy(fightStrategy);
		if (brain != null)
			head.add(brain);
		if (jaw != null)
			head.add(jaw);
		if (teeth != null)
			head.add(teeth);
		if (claws != null);
			legs.add(claws);
		if (head != null)
			creature.add(head);
		if (torso != null)
			creature.add(torso);
		if (legs != null)
			creature.add(legs);
		return creature;
	};
	
	public abstract void setTorso(Torso t);
	public abstract void setHead(Head h);
	public abstract void setLegs(Legs l);
	public abstract void setBrain(Brain b);
	public abstract void setClaws(Claws c);
	public abstract void setTeeth(Teeth t);
	public abstract void setJaw(Jaw j);
	public abstract void setName(String s);
	public abstract void setFightStrategy(FightStrategy f);
}
