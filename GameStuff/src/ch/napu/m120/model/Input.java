package ch.napu.m120.model;

import java.util.ArrayList;

public class Input {

	private static ArrayList<String> inputs = new ArrayList<String>();

	public static void add(String e) {
		Input.inputs.add(e);
	}

	public static void remove(String e) {
		Input.inputs.remove(e);
	}

	public static boolean contains(String code) {
		
		return Input.inputs.contains(code);
	}

}