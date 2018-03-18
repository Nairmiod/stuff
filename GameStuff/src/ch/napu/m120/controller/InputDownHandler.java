package ch.napu.m120.controller;

import ch.napu.m120.model.Globals;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class InputDownHandler implements EventHandler<KeyEvent> {

	@Override
	public void handle(KeyEvent e) {

		String code = e.getCode().toString();
		if (!Globals.inputs.contains(code))
			Globals.inputs.add(code);

	}

}
