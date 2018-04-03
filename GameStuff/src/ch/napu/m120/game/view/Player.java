package ch.napu.m120.game.view;

import ch.napu.m120.shared.ressources.GameConstants;

public class Player extends Sprite {

	public Player(String filename) {
		super(filename);

	}

	@Override
	public void update(double time) {

		this.positionX += this.velocityX * time;
		this.positionY += this.velocityY * time;

		if (this.positionX < 0)
			this.positionX = 0;

		if (this.positionY < 0)
			this.positionY = 0;

		if (this.positionX + this.width > GameConstants.SCENE_WIDTH)
			this.positionX = GameConstants.SCENE_WIDTH - this.height;

		if (this.positionY + this.height > GameConstants.SCENE_HEIGHT)
			this.positionY = GameConstants.SCENE_HEIGHT - this.height;

	}

}
