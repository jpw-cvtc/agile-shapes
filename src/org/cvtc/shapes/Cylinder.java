package org.cvtc.shapes;

public class Cylinder extends Shape implements Renderer {
	
	private float radius = 0.0f;
	private float height = 0.0f;
	
	public Cylinder(Dialog messageBox, final float radius, final float height) throws IllegalArgumentException {
		super(messageBox);
		setRadius(radius);
		setHeight(height);
	}

	public Cylinder(Dialog dialog) {
		super(dialog);
	}

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) throws IllegalArgumentException {
		if (!isValueGreaterThanZero(radius)) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) throws IllegalArgumentException {
		if (!isValueGreaterThanZero(height)) {
			throw new IllegalArgumentException();
		}
		this.height = height;
	}

	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height);
	}

	@Override
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	public void render() {
		getMessageBox().show(this.toString(), "Cylinder");
	}
	
	@Override
	public String toString() {
		return "Cylinder: radius=" + getRadius() + "; height=" + getHeight() + 
				"; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}
	
}
