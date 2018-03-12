package ch.napu.m120.controller;



import ch.napu.m120.ressources.GameConstants;
import ch.napu.m120.view.GameScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StartGameHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
   
          Group game =  new Group();
          Scene gameScene = new GameScene(game, 230, 100);
          Stage newWindow = new Stage();
          newWindow.setTitle(GameConstants.GAMENAME);
          newWindow.setScene(gameScene);
          newWindow.show();
		
    }
}