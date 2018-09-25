package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		Renderer cuboid = new Cuboid(new MessageBox(), 1, 2, 3);
		Renderer cylinder = new Cylinder(new MessageBox(), 1, 2);
		Renderer sphere = new Sphere(new MessageBox(), 1);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}
