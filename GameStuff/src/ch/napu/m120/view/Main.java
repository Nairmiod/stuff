package ch.napu.m120.view;


import ch.napu.m120.ressources.GameConstants;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			HBox root = new StartScreen();
			Scene scene = new Scene(root,950,800);
			scene.getStylesheets().add(getClass().getResource("css/application.css").toExternalForm());

			primaryStage.setTitle(GameConstants.LAUNCHERNAME);
			primaryStage.setScene(scene);
			
			
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
