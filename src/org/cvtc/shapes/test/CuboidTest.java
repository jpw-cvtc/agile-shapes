package org.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBox;
import org.junit.Before;
import org.junit.Test;

public class CuboidTest {
	
	Dialog messageBox;
	
	@Before
	public void setup() {
		this.messageBox = new MessageBoxSub();
	}

	@Test
	public void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(messageBox, 3, 3, 3);
		assertEquals(54, cube1.surfaceArea(), 0.0002);	
	}

	@Test
	public void testVolume() {
		Cuboid cube1 = new Cuboid(messageBox, 3, 3, 3);
		assertEquals(27, cube1.volume(), 0.0002);	
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCuboid() {
		new Cuboid(messageBox, -1, 0, 0);
	}

	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(messageBox, 1, 2, 2);
		assertEquals(1, cube1.getWidth(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		Cuboid cube1 = new Cuboid(messageBox, 2, 1, 2);
		assertEquals(1, cube1.getHeight(), 0.0002);
	}

	@Test
	public void testGetDepth() {
		Cuboid cube1 = new Cuboid(messageBox, 2, 2, 1);
		assertEquals(1, cube1.getDepth(), 0.0002);
	}

	@Test
	public void testRender() {
		Cuboid cube1 = new Cuboid(messageBox, 2, 2, 1);
		assertEquals(0x00, messageBox.show(cube1.toString(), "Cylinder"), 0.0002);
	}
}
