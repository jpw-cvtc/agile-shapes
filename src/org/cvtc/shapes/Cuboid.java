package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cuboid extends Shape {

	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	public Cuboid(final float width, final float height, final float depth) {
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	public float getWidth() {
		return width;
	}


	private void setWidth(final float width) {
		this.width = setValueGreaterThanZeroOrZero(width);
	}

	public float getHeight() {
		return height;
	}


	private void setHeight(final float height) {
		this.height = setValueGreaterThanZeroOrZero(height);
	}


	public float getDepth() {
		return depth;
	}


	private void setDepth(final float depth) {
		this.depth = setValueGreaterThanZeroOrZero(depth);
	}

	@Override
	public float surfaceArea() {
		return (2 * ((width * depth) + (width * height) + (depth * height)));
	}

	@Override
	public float volume() {
		return width * height * depth;
	}

	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, this.toString(), "Cuboid", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public String toString() {
		return "Cuboid: width=" + getWidth() + "; height=" + getHeight() + "; depth=" + getDepth() + 
				"; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}

}
