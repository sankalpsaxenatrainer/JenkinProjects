package com.cognizant;

import java.util.ArrayList;
import java.util.List;



public class TextMessageBean {

	private List messages = new ArrayList();

	public String textMethod(String msg) {
		String textMessageBean = "Training Bean Direct Example Says " + msg;
		messages.add(textMessageBean);
		return textMessageBean;
	}

	public String toString() {
		return messages.toString();
	}
}
