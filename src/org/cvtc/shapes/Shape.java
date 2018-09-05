package org.cvtc.shapes;

public abstract class Shape {
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
	protected static float setValueGreaterThanZeroOrZero(final float value) {
		return value > 0 ? value : 0;
	}
}
