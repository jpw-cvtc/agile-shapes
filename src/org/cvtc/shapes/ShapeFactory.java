package org.cvtc.shapes;

public class ShapeFactory {
	
	private Dialog dialog;
	
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	}
	
	private Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape make(ShapeType type) {
		Shape shape = null;
		switch (type){
			case Cuboid: shape = new Cuboid(this.dialog);
				break;
			case Cylinder: shape = new Cylinder(this.dialog);
				break;
			case Sphere: shape = new Sphere(this.dialog);
				break;
		}
		return shape;
	}
	
}