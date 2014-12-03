/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs407.FinalProject.CreatureParts.AverageLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent;
import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.CreatureParts.FastLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.SlowLegs;

/**
 * @author ackleys
 *
 */
public class LegsTest {

	Legs legs;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		legs = new AverageLegs();
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.SlowLegs#toString()}.
	 */
	@Test
	public final void testToString() {
		assertEquals("Average Legs", legs.toString());
		legs = new FastLegs();
		assertEquals("Fast Legs", legs.toString());
		legs = new SlowLegs();
		assertEquals("Slow Legs", legs.toString());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Legs#getHealth()}.
	 */
	@Test
	public final void testGetHealth() {
		legs = new AverageLegs();
		assertEquals(15, legs.getHealth());
		legs = new FastLegs();
		assertEquals(10, legs.getHealth());
		legs = new SlowLegs();
		assertEquals(20, legs.getHealth());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Legs#getSpeed()}.
	 */
	@Test
	public final void testGetSpeed() {
		legs = new AverageLegs();
		assertEquals(10, legs.getSpeed());
		legs = new FastLegs();
		assertEquals(15, legs.getSpeed());
		legs = new SlowLegs();
		assertEquals(5, legs.getSpeed());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Legs#getWeight()}.
	 */
	@Test
	public final void testGetWeight() {
		legs = new AverageLegs();
		assertEquals(10, legs.getWeight());
		legs = new FastLegs();
		assertEquals(5, legs.getWeight());
		legs = new SlowLegs();
		assertEquals(15, legs.getWeight());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.Legs#getDamage()}.
	 */
	@Test
	public final void testGetDamage() {
		legs = new AverageLegs();
		assertEquals(6, legs.getDamage());
		legs = new FastLegs();
		assertEquals(4, legs.getDamage());
		legs = new SlowLegs();
		assertEquals(8, legs.getDamage());
	}



	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent#add(edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent)}.
	 */
	@Test
	public final void testAdd() {
		CompositeCreatureComponent component = new CompositeCreatureComponent();
		component.add(legs);
		ArrayList<CreatureComponent> results = component.getCreatureComponents();
		assertEquals(1, results.size());
		component.add(legs);
		assertEquals(2, results.size());
		component.add(legs);
		component.add(legs);
		assertEquals(4, results.size());
	}

	/**
	 * Test method for {@link edu.ccsu.cs407.FinalProject.CreatureParts.CompositeCreatureComponent#remove(edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent)}.
	 */
	@Test
	public final void testRemove() {
		CompositeCreatureComponent component = new CompositeCreatureComponent();
		component.add(legs);
		component.add(legs);
		component.add(legs);
		component.add(legs);
		ArrayList<CreatureComponent> results = component.getCreatureComponents();
		assertEquals(4, results.size());
		component.remove(legs);
		assertEquals(3, component.getCreatureComponents().size());
		component.remove(legs);
		component.remove(legs);
		component.remove(legs);
		assertEquals(0, component.getCreatureComponents().size());
		component.remove(legs);
		assertEquals(0, component.getCreatureComponents().size());
	}
}
