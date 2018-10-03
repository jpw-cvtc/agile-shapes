package org.cvtc.shapes;

public class Sphere extends Shape implements Renderer {

	private float radius = 0.0f;
	
	public Sphere(Dialog messageBox, final float radius) throws IllegalArgumentException {
		super(messageBox);
		setRadius(radius);
	}
	
	public Sphere(Dialog dialog) {
		super(dialog);
	}

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		if (!isValueGreaterThanZero(radius)) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}

	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}
	
	@Override
	public float volume() {
		return (float) ((4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3 ));
	}

	@Override
	public void render() {
		getMessageBox().show(this.toString(), "Sphere");
	}
	
	@Override
	public String toString() {
		return "Sphere: radius=" + getRadius() + "; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}

}
