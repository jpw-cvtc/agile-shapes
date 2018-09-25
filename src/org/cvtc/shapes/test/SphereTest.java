package org.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;

import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.Sphere;
import org.junit.Before;
import org.junit.Test;

public class SphereTest {
	
	Dialog messageBox;
	
	@Before
	public void setup() {
		this.messageBox = new MessageBoxSub();
	}
	
	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(messageBox, 1);
		assertEquals(12.566370964050293, sphere1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(messageBox, 1);
		assertEquals(4.188790321350098, sphere1.volume(), 0.0002);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere() {
		new Sphere(messageBox, -1);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(messageBox, 1);
		assertEquals(1, sphere1.getRadius(), 0.0002);
	}
	
	@Test
	public void testRender() {
		Sphere sphere1 = new Sphere(messageBox, 1);
		assertEquals(0x00, messageBox.show(sphere1.toString(), "Sphere"), 0.0002);
	}

}
