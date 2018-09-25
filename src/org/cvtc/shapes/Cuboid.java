package org.cvtc.shapes;

public class Cuboid extends Shape implements Renderer {

	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	public Cuboid(Dialog messageBox, final float width, final float height, final float depth) throws IllegalArgumentException {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	public float getWidth() {
		return width;
	}


	private void setWidth(final float width) throws IllegalArgumentException {
		if (!isValueGreaterThanZero(width)) {
			throw new IllegalArgumentException();
		}
		this.width = width;
	}

	public float getHeight() {
		return height;
	}


	private void setHeight(final float height) throws IllegalArgumentException {
		if (!isValueGreaterThanZero(height)) {
			throw new IllegalArgumentException();
		}
		this.height = height;
	}


	public float getDepth() {
		return depth;
	}


	private void setDepth(final float depth) throws IllegalArgumentException {
		if (!isValueGreaterThanZero(depth)) {
			throw new IllegalArgumentException();
		}
		this.depth = depth;
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
		getMessageBox().show(this.toString(), "Cuboid");
	}
	
	@Override
	public String toString() {
		return "Cuboid: width=" + getWidth() + "; height=" + getHeight() + "; depth=" + getDepth() + 
				"; surfaceArea=" + surfaceArea() + "; volume=" + volume();
	}

}
