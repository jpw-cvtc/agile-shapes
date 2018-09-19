package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(12.566370964050293, sphere1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(4.188790321350098, sphere1.volume(), 0.0002);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere() {
		new Sphere(-1);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(1, sphere1.getRadius(), 0.0002);
	}

}
