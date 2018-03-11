package ch.napu.m120.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartGameHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		try {
		FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("NewWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("New Window");
        stage.setScene(scene);
        stage.show();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}