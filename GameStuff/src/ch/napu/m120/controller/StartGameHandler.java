package ch.napu.m120.controller;



import ch.napu.m120.ressources.GameConstants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class StartGameHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
   
          StackPane secondaryLayout =  new StackPane();
          Scene secondScene = new Scene(secondaryLayout, 230, 100);
          Stage newWindow = new Stage();
          newWindow.setTitle(GameConstants.GAMENAME);
          newWindow.setScene(secondScene);

          newWindow.show();
		
    }
}