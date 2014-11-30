package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.Brain;
import edu.ccsu.cs407.FinalProject.CreatureParts.Claws;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Jaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Teeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;
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


	public void setTorso(Torso t) 
	{
		torso = t;
	}

	
	public void setHead(Head h) 
	{
		head = h;
	}

	
	public void setLegs(Legs l)
	{
		legs = l;
	}

	
	public void setBrain(Brain b) 
	{	
		brain = b;
	}

	
	public void setClaws(Claws c) 
	{
		claws = c;
	}

	
	public void setTeeth(Teeth t) 
	{
		teeth = t;
	}

	
	public void setJaw(Jaw j) 
	{
		jaw = j;
	}

	public void setName(String s) 
	{
		name = s;
	}

	public void setFightStrategy(FightStrategy f) 
	{
		fightStrategy = f;
	}
}
