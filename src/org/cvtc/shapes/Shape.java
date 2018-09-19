package org.cvtc.shapes;

public abstract class Shape {
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
	public static boolean isValueGreaterThanZero(final float value) {
		return value > 0 ? true : false;
	}
}
