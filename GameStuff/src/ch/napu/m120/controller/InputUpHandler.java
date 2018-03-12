package ch.napu.m120.controller;

import ch.napu.m120.model.Input;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class InputUpHandler implements EventHandler<KeyEvent> {

	@Override
	public void handle(KeyEvent e) {
		String code = e.getCode().toString();
		Input.remove(code);
	}

}
