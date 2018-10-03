package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		ShapeFactory factory = new ShapeFactory(dialog);
		
		Shape cuboid = factory.make(ShapeType.Cuboid);
		cuboid.render();
		
		Shape cylinder = factory.make(ShapeType.Cylinder);
		cylinder.render();
		
		Shape sphere = factory.make(ShapeType.Sphere);
		sphere.render();
	}

}
