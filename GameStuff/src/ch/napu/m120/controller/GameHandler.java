package ch.napu.m120.controller;

import ch.napu.m120.model.Globals;
import ch.napu.m120.ressources.GameConstants;
import ch.napu.m120.view.Player;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;


public class GameHandler extends AnimationTimer {

	private Long currentNanoTime;
	private Long lastNanoTime;
	int help = 0;
	private Player player = new Player("briefcase.png");


	public GameHandler() {
		super();
		
	}

	public void handle(long now) {

		
		this.lastNanoTime = now;

		this.currentNanoTime = System.nanoTime();

		// calculate time since last update.
		double elapsedTime = (currentNanoTime - lastNanoTime) / 1000000.0;
		lastNanoTime = currentNanoTime;

		// game logic
		player.setVelocity(0, 0);
		if (Globals.inputs.contains("A"))
			player.addVelocity(-100, 0);
		if (Globals.inputs.contains("D"))
			player.addVelocity(100, 0);
		if (Globals.inputs.contains("W"))
			player.addVelocity(0, -100);
		if (Globals.inputs.contains("S"))
			player.addVelocity(0, 100);

		player.update(elapsedTime);

		// collision detection

		// render
		GraphicsContext gc = Globals.gameArea.getGraphicsContext2D();
		gc.clearRect(0, 0, GameConstants.SCENE_WIDTH, GameConstants.SCENE_HEIGHT);
		player.render(gc);

	}

}
