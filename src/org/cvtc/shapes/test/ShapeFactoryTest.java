package org.cvtc.shapes.test;

import static org.junit.Assert.assertTrue;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class ShapeFactoryTest {
	
	@Test
	public void testMakeCylinder() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		assertTrue(factory.make(ShapeType.Cylinder) instanceof Cylinder);
	}
	
	@Test
	public void testMakeCuboid() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		assertTrue(factory.make(ShapeType.Cuboid) instanceof Cuboid);
	}
	
	@Test
	public void testMakeSphere() {
		ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
		assertTrue(factory.make(ShapeType.Sphere) instanceof Sphere);
	}

}
