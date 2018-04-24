package ch.napu.m120.launcher.controller;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.settings.GameSettings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Game extends com.almasb.fxgl.app.GameApplication {

	private Entity player;

	@Override
	protected void initSettings(GameSettings settings) {
		settings.setWidth(600);
		settings.setHeight(600);
		settings.setTitle("Basic Game App");
		settings.setVersion("0.1");
		settings.setIntroEnabled(false); // turn off intro
		settings.setMenuEnabled(false); // turn off menus
	}

	@Override
	protected void initInput() {
		Input input = getInput(); // get input service

		input.addAction(new UserAction("Move Right") {
			@Override
			protected void onAction() {
				player.getPositionComponent().translateX(5); // move right 5 pixels
			}
		}, KeyCode.D);

		input.addAction(new UserAction("Move Left") {
			@Override
			protected void onAction() {
				player.getPositionComponent().translateX(-5); // move left 5 pixels
			}
		}, KeyCode.A);

		input.addAction(new UserAction("Move Up") {
			@Override
			protected void onAction() {
				player.getPositionComponent().translateY(-5); // move up 5 pixels
			}
		}, KeyCode.W);

		input.addAction(new UserAction("Move Down") {
			@Override
			protected void onAction() {
				player.getPositionComponent().translateY(5); // move down 5 pixels
			}
		}, KeyCode.S);
	}

	@Override
	protected void initAssets() {

	}

	@Override
	protected void initGame() {
		player = Entities.builder().at(300, 300).viewFromNode(new Rectangle(25, 25, Color.BLUE))
				.buildAndAttach(getGameWorld());
	}

	@Override
	protected void initPhysics() {

	}

	@Override
	protected void initUI() {
		Text textPixels = new Text();
		textPixels.setTranslateX(50); // x = 50
		textPixels.setTranslateY(100); // y = 100

		getGameScene().addUINode(textPixels); // add to the scene graph
	}

	@Override
	protected void onUpdate(double tpf) {

	}
}
