/**
 * 
 */
package edu.ccsu.cs407.FinalProject.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.AverageClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.Claws;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.WeakClaws;

/**
 * Test all classes that inherit from Claws
 * @author ackleys
 *
 */
public class ClawsTest {

	Claws claws;
	
	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.AverageClaws#toString()}.
	 */
	@Test
	public void testToString() {
		claws = new AverageClaws();
		claws.toString();
		assertEquals("Average Claws", claws.toString());
		claws = new SharpClaws();
		assertEquals("Sharp Claws", claws.toString());
		claws = new WeakClaws();
		assertEquals("Weak Claws", claws.toString());
	}



	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Claws#getDamage()}.
	 */
	@Test
	public void testGetDamage() {
		claws = new AverageClaws();
		assertEquals(5, claws.getDamage());
		claws = new SharpClaws();
		assertEquals(10, claws.getDamage());
		claws = new WeakClaws();
		assertEquals(3, claws.getDamage());
	}

	

}
