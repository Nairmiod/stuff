package ch.napu.m120.controller;

import java.util.ArrayList;

import ch.napu.m120.model.LongValue;
import javafx.animation.AnimationTimer;

public class GameHandler extends AnimationTimer {

	private Long currentNanoTime;
	private ArrayList<String> input;


	public GameHandler(ArrayList<String> input) {
		super();
		this.input = input;
		
	}

	@Override
	public void handle(long current) {
		Object lastNanoTime;
		// calculate time since last update.
		double elapsedTime = (currentNanoTime - (long) (lastNanoTime)) / 1000000000.0;
		lastNanoTime = currentNanoTime;

		// game logic

		briefcase.setVelocity(0, 0);
		if (input.contains("LEFT"))
			briefcase.addVelocity(-200, 0);
		if (input.contains("RIGHT"))
			briefcase.addVelocity(200, 0);
		if (input.contains("UP"))
			briefcase.addVelocity(0, -200);
		if (input.contains("DOWN"))
			briefcase.addVelocity(0, 200);

		briefcase.update(elapsedTime);

		// collision detection

		// render

		gc.clearRect(0, 0, 512, 512);
		briefcase.render(gc);

	}

}
