package ch.napu.m120.launcher.view;

<<<<<<< HEAD
import ch.napu.m120.shared.ressources.GameConstants;
=======
import ch.napu.m120.launcher.ressources.GameConstants;
>>>>>>> refs/remotes/origin/master
import javafx.scene.layout.HBox;

public class StartScreen extends HBox {

	public StartScreen() {

		super();
		this.getChildren().add(new Rankings(GameConstants.BEST));
		this.getChildren().add(new StartButton("Start"));
		this.getChildren().add(new Rankings(GameConstants.RECENT));

	}
}
