package ch.napu.m120.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class RecentScoreObservableList {

	private final static ObservableList<Score> data = FXCollections.observableArrayList();
	public static TableView<Score> table = null;

	public static TableView<Score> getTable() {
		return table;
	}

	public static void setTable(TableView<Score> table) {
		RecentScoreObservableList.table = table;
	}

	public static ObservableList<Score> get() {
		return data;
	}

}
