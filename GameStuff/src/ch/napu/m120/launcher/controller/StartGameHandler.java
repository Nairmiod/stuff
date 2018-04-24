package ch.napu.m120.launcher.controller;

import ch.napu.m120.game.controller.GameHandler;
import ch.napu.m120.game.view.GameScene;
import ch.napu.m120.shared.ressources.GameConstants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartGameHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {

		Group game = new Group();
		Scene gameScene = new GameScene(game, GameConstants.SCENE_WIDTH, GameConstants.SCENE_HEIGHT);
		Stage newWindow = new Stage();

		newWindow.setTitle(GameConstants.GAMENAME);
		newWindow.setScene(gameScene);
		GameHandler handler = new GameHandler();
		handler.start();
		newWindow.show();
	}
}