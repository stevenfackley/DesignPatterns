package edu.ccsu.cs407.FinalProject.Test;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Creatures.Wolf;
import edu.ccsu.cs407.FinalProject.Environment.Tile;
import edu.ccsu.cs407.FinalProject.Environment.TileFactory;


public class CreaturePartsTest 
{
	@Test
	public void test() 
	{
		Creature w = new Wolf();
		Creature x = new Wolf();
		
		System.out.println(!w.getName().equalsIgnoreCase(x.getName()));
	}
}