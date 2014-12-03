/**
 * 
 */
package edu.ccsu.cs407.FinalProject.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.GiantHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead;

/**
 * @author ackleys
 *
 */
public class HeadTest {
	Head head;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		head = new GiantHead();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.GiantHead#toString()}.
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead#toString()}.
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead#toString()}.
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.MediumHead#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Giant Head", head.toString());
		head = new LargeHead();
		assertEquals("Large Head", head.toString());
		head = new SmallHead();
		assertEquals("Small Head", head.toString());
		head = new MediumHead();
		assertEquals("Medium Head", head.toString());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Head#getHealth()}.
	 */
	@Test
	public final void testGetHealth() {
		head = new GiantHead();
		assertEquals(12, head.getHealth());
		head = new LargeHead();
		assertEquals(9, head.getHealth());
		head = new SmallHead();
		assertEquals(3, head.getHealth());
		head = new MediumHead();
		assertEquals(6, head.getHealth());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Head#getWeight()}.
	 */
	@Test
	public final void testGetWeight() {
		head = new GiantHead();
		assertEquals(8, head.getWeight());
		head = new LargeHead();
		assertEquals(6, head.getWeight());
		head = new SmallHead();
		assertEquals(2, head.getWeight());
		head = new MediumHead();
		assertEquals(4, head.getWeight());
	}

}
