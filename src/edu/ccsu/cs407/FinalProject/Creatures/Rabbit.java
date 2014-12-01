package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.DullTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.FastLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.FightStrategies.RunAway;


/**
 * Rabbit
 * defines a rabbit object. A rabbit has
 * fast legs, a small torso, a small head, 
 * a normal brain, a normal jaw, and dull
 * teeth.
 * Objects composition is handled in the contrsuctor. 
 * @author dcruz
 * @author steve
 * @author seth
 */

public class Rabbit extends Creature 
{

	public Rabbit() 
	{
		super("Rabbit", new RunAway());
		
		Legs l = new FastLegs();
		
		Torso t = new SmallTorso();
		
		Head h = new SmallHead();
		h.add(new NormalBrain());
		h.add(new NormalJaw());
		h.add(new DullTeeth());
		
		this.add(l);
		this.add(h);
		this.add(t);
	}
}
