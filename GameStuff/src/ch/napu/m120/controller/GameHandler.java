package ch.napu.m120.controller;

import java.util.ArrayList;

import ch.napu.m120.model.Globals;
import ch.napu.m120.model.Input;
import ch.napu.m120.model.LongValue;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class GameHandler extends AnimationTimer {

	private Long currentNanoTime;
	private Long lastNanoTime;

	public GameHandler() {
		super();
		
		
	}

	public void handle(long current) {
		
		this.currentNanoTime = current;
		
		// calculate time since last update.
		double elapsedTime = (currentNanoTime - lastNanoTime) / 1000000000.0;
		lastNanoTime = currentNanoTime;

		// game logic

		Globals.player.setVelocity(0, 0);
		if (Input.contains("LEFT"))
			Globals.player.addVelocity(-200, 0);
		if (Input.contains("RIGHT"))
			Globals.player.addVelocity(200, 0);
		if (Input.contains("UP"))
			Globals.player.addVelocity(0, -200);
		if (Input.contains("DOWN"))
			Globals.player.addVelocity(0, 200);

		Globals.player.update(elapsedTime);

		// collision detection

		// render
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.clearRect(0, 0, 512, 512);
		Globals.player.render(gc);

	}

}
