/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.DullTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.HybridTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Teeth;

/**
 * @author ackleys
 *
 */
public class TeethTest {

	Teeth teeth;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		teeth = new SharpTeeth();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.SharpTeeth#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Sharp Teeth", teeth.toString());
		teeth = new DullTeeth();
		assertEquals("Dull Teeth", teeth.toString());
		teeth = new HybridTeeth();
		assertEquals("Hybrid Teeth (Omnivore)", teeth.toString());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#getDamage()}.
	 */
	@Test
	public final void testGetDamage() {
		teeth = new SharpTeeth();
		assertEquals(7, teeth.getDamage());
		teeth = new DullTeeth();
		assertEquals(3, teeth.getDamage());
		teeth = new HybridTeeth();
		assertEquals(5, teeth.getDamage());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#canEatPlants()}.
	 */
	@Test
	public final void testCanEatPlants() {
		teeth = new SharpTeeth();
		assertEquals(false, teeth.canEatPlants());
		teeth = new DullTeeth();
		assertEquals(true, teeth.canEatPlants());
		teeth = new HybridTeeth();
		assertEquals(true, teeth.canEatPlants());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Teeth#canEatAnimals()}.
	 */
	@Test
	public final void testCanEatAnimals() {
		teeth = new SharpTeeth();
		assertEquals(true, teeth.canEatAnimals());
		teeth = new DullTeeth();
		assertEquals(false, teeth.canEatAnimals());
		teeth = new HybridTeeth();
		assertEquals(true, teeth.canEatAnimals());
	}

}
