package ch.napu.m120.launcher.view;

import ch.napu.m120.launcher.controller.StartGameHandler;
import javafx.scene.control.Button;

public class StartButton extends Button {

	// TODO:Layout,Size
	public StartButton(String name) {
		super(name);
		this.setOnAction(new StartGameHandler());
		this.setPrefSize(150, 150);

	}
}
