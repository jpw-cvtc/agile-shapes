package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class CuboidTest {

	@Test
	public void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(3, 3, 3);
		assertEquals(54, cube1.surfaceArea(), 0.0002);	
	}

	@Test
	public void testVolume() {
		Cuboid cube1 = new Cuboid(3, 3, 3);
		assertEquals(27, cube1.volume(), 0.0002);	
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCuboid() {
		new Cuboid(-1, 0, 0);
	}

	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(1, 2, 2);
		assertEquals(1, cube1.getWidth(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		Cuboid cube1 = new Cuboid(2, 1, 2);
		assertEquals(1, cube1.getHeight(), 0.0002);
	}

	@Test
	public void testGetDepth() {
		Cuboid cube1 = new Cuboid(2, 2, 1);
		assertEquals(1, cube1.getDepth(), 0.0002);
	}

}
