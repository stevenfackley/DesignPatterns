/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.Jaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalJaw;

/**
 * @author ackleys
 *
 */
public class JawTest {

	Jaw jaw;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		jaw = new NormalJaw();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.NormalJaw#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Normal Jaw (Cant eat larger animals)", jaw.toString());
		jaw = new LargeJaw();
		assertEquals("Large Jaw (Eat Larger Animals)", jaw.toString());
		
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Jaw#canEatLarger()}.
	 */
	@Test
	public final void testCanEatLarger() {
		jaw = new NormalJaw();
		assertEquals(false, jaw.canEatLarger());
		jaw = new LargeJaw();
		assertEquals(true, jaw.canEatLarger());
	}

}
