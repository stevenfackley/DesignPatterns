package test;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.AverageLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Brain;
import edu.ccsu.cs407.FinalProject.CreatureParts.Claws;
import edu.ccsu.cs407.FinalProject.CreatureParts.DullTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Jaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.Teeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.FightStrategies.Fights;


public class CreaturePartsTest 
{

	@Test
	public void test() 
	{
		Creature creature = new Creature("TEST", new Fights());
		Head h = new SmallHead();
		Brain b = new NormalBrain();
		Teeth t = new DullTeeth();
		Jaw j = new NormalJaw();
		Legs l = new AverageLegs();
		Claws c = new SharpClaws();
		Torso mt = new MediumTorso();
		
		
		h.add(b);
		h.add(t);
		h.add(j);
		l.add(c);
		
		creature.add(h);
		creature.add(l);
		creature.add(mt);
		System.out.println(creature.toString());
		
		Creature x = creature.clone();
		System.out.println(x.toString());
	}
}