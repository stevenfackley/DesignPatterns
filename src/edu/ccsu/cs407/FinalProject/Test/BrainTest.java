/**
 * 
 */
package edu.ccsu.cs407.FinalProject.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.Brain;
import edu.ccsu.cs407.FinalProject.CreatureParts.CrazedBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalBrain;

/**
 * Tests all implementations of brain
 * @author ackleys
 *
 */
public class BrainTest {

	Brain brain;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		brain = new NormalBrain();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.NormalBrain#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Normal Brain (Not a Cannibal)", brain.toString());
		brain = new CrazedBrain();
		assertEquals("Crazed Brain (Cannibalism)", brain.toString());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Brain#canEatSameSpecies()}.
	 */
	@Test
	public final void testCanEatSameSpecies() {
		brain = new NormalBrain();
		assertEquals(false, brain.canEatSameSpecies());
		brain = new CrazedBrain();
		assertEquals(true, brain.canEatSameSpecies());
	}


}
