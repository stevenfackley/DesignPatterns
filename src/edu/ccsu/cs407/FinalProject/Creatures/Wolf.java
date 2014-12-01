package edu.ccsu.cs407.FinalProject.Creatures;

import edu.ccsu.cs407.FinalProject.CreatureParts.AverageLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.CrazedBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.FightStrategies.Hybrid;

/**
 * Wolf
 * defines a wolf object. A wolf has a hybrid fighting
 * strategy, fast legs, sharp claws, a medium torso, a
 * medium head, a crazed brain, a large jaw, and sharp teeth.
 * Objects composition is handled in the constructor.
 * @author dcruz
 * @author steve
 * @author seth
 */

public class Wolf extends Creature 
{

	public Wolf() 
	{
		super("Wolf", new Hybrid());
		
		Legs l = new AverageLegs();
		l.add(new SharpClaws());
		
		Torso t = new MediumTorso();
		
		Head h = new MediumHead();
		h.add(new CrazedBrain());
		h.add(new LargeJaw());
		h.add(new SharpTeeth());
		
		this.add(l);
		this.add(h);
		this.add(t);
	}
}
