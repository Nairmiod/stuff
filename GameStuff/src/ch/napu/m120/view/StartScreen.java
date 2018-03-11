package ch.napu.m120.view;

import ch.napu.m120.ressources.GameConstants;
import javafx.scene.layout.HBox;

public class StartScreen extends HBox {

	public StartScreen(){
		
		super();
		this.getChildren().add(new Rankings(GameConstants.BEST));
		this.getChildren().add(new StartButton("Start"));
		this.getChildren().add(new Rankings(GameConstants.RECENT));
		
	}
}
