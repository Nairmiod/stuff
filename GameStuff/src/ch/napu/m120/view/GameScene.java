package ch.napu.m120.view;

import java.util.ArrayList;

import ch.napu.m120.controller.GameHandler;
import ch.napu.m120.controller.InputDownHandler;
import ch.napu.m120.controller.InputUpHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;



public class GameScene extends Scene {

	ArrayList<String> input = new ArrayList<String>();

	public GameScene(Group game, int i, int j) {
		super(game, 600, 600);

		this.setOnKeyPressed(new InputDownHandler());

		this.setOnKeyReleased(new InputUpHandler());

			
		Canvas canvas = new Canvas(512, 512);
		game.getChildren().add(canvas);



		new GameHandler().start();

	}

}
