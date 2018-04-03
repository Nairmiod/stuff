package ch.napu.m120.game.view;

import java.util.ArrayList;

import ch.napu.m120.game.controller.InputDownHandler;
import ch.napu.m120.game.controller.InputUpHandler;
import ch.napu.m120.shared.model.Globals;
import ch.napu.m120.shared.ressources.GameConstants;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

public class GameScene extends Scene {

	ArrayList<String> input = new ArrayList<String>();

	public GameScene(Group game, int i, int j) {
		super(game, i, j);

		this.setOnKeyPressed(new InputDownHandler());

		this.setOnKeyReleased(new InputUpHandler());

		Globals.gameArea = new Canvas(GameConstants.SCENE_WIDTH, GameConstants.SCENE_HEIGHT);
		game.getChildren().add(Globals.gameArea);

	}

}
