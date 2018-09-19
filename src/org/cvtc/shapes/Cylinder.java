package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {
	
	private float radius = 0.0f;
	private float height = 0.0f;
	
	public Cylinder(final float radius, final float height) throws IllegalArgumentException {
		setRadius(radius);
		setHeight(height);
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
		JOptionPane.showMessageDialog(null, this.toString(), "Cylinder", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public String toString() {
		return "Cylinder: radius=" + getRadius() + "; height=" + getHeight() + 
				"; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}
	
}
