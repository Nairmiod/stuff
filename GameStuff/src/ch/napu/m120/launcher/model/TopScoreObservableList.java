package ch.napu.m120.launcher.model;

import ch.napu.m120.launcher.model.TopScoreObservableList;
import ch.napu.m120.shared.model.Score;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class TopScoreObservableList {

	public static TableView<Score> table = null;
	private final static ObservableList<Score> data = FXCollections.observableArrayList();

	public static TableView<Score> getTable() {
		return table;
	}

	public static void setTable(TableView<Score> table) {
		TopScoreObservableList.table = table;
	}

	public static ObservableList<Score> get() {

		return data;
	}

}
