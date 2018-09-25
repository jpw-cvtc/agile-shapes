package org.cvtc.shapes.test;

import org.cvtc.shapes.Dialog;

public class MessageBoxSub implements Dialog {
	
	public MessageBoxSub() {
		
	}

	@Override
	public int show(String message, String title) {
		return 0x00;
	}
	
}
