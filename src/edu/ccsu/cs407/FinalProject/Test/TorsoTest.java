/**
 * 
 */
package edu.ccsu.cs407.FinalProject.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.GiantTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;

/**
 * @author ackleys
 *
 */
public class TorsoTest {

	Torso torso;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		torso = new GiantTorso();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.GiantTorso#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Giant Torso", torso.toString());
		torso = new LargeTorso();
		assertEquals("Large Torso", torso.toString());
		torso = new SmallTorso();
		assertEquals("Small Torso", torso.toString());
		torso = new MediumTorso();
		assertEquals("Medium Torso", torso.toString());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Torso#getHealth()}.
	 */
	@Test
	public final void testGetHealth() {
		torso = new GiantTorso();
		assertEquals(40, torso.getHealth());
		torso = new LargeTorso();
		assertEquals(30, torso.getHealth());
		torso = new SmallTorso();
		assertEquals(10, torso.getHealth());
		torso = new MediumTorso();
		assertEquals(20, torso.getHealth());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Torso#getWeight()}.
	 */
	@Test
	public final void testGetWeight() {
		torso = new GiantTorso();
		assertEquals(20, torso.getWeight());
		torso = new LargeTorso();
		assertEquals(15, torso.getWeight());
		torso = new SmallTorso();
		assertEquals(5, torso.getWeight());
		torso = new MediumTorso();
		assertEquals(10, torso.getWeight());
	}

}
