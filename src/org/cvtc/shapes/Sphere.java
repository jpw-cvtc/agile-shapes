package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Sphere extends Shape {

	private float radius = 0.0f;
	
	public Sphere(final float radius) {
		setRadius(radius);
	}
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = setValueGreaterThanZeroOrZero(radius);
	}

	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}
	
	@Override
	public float volume() {
		return (float) ((4 * Math.PI * Math.pow(radius, 3)) / 3);
	}

	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, this.toString(), "Sphere", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public String toString() {
		return "Sphere: radius=" + getRadius() + "; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}

}
