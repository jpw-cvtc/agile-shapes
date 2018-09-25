package org.cvtc.shapes;

public abstract class Shape {
	
	private Dialog messageBox;
	
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
	
	protected Dialog getMessageBox() {
		return this.messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public static boolean isValueGreaterThanZero(final float value) {
		return value > 0 ? true : false;
	}
}
