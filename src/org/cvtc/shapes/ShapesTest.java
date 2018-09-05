package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		Cuboid cuboid = new Cuboid(1, 2, 3);
		Cylinder cylinder = new Cylinder(1, 2);
		Sphere sphere = new Sphere(1);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}
