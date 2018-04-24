package ch.napu.m120.launcher.view;

import ch.napu.m120.launcher.model.Data;
import ch.napu.m120.launcher.model.RecentScoreObservableList;
import ch.napu.m120.launcher.model.Score;
import ch.napu.m120.launcher.model.TopScoreObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Rankings extends TableView<Score> {

	
	public Rankings(int kind) {
		super();

		TableColumn<Score, String> RankCol = new TableColumn<Score, String>("Rank");
		RankCol.setCellValueFactory(new PropertyValueFactory<Score, String>("rank"));
		RankCol.setPrefWidth(50);

		TableColumn<Score, String> NameCol = new TableColumn<Score, String>("Name");
		NameCol.setCellValueFactory(new PropertyValueFactory<Score, String>("name"));
		NameCol.setPrefWidth(100);

		TableColumn<Score, String> ScoreCol = new TableColumn<Score, String>("Score");
		ScoreCol.setCellValueFactory(new PropertyValueFactory<Score, String>("score"));
		ScoreCol.setPrefWidth(100);

		this.getColumns().add(RankCol);
		this.getColumns().add(NameCol);
		this.getColumns().add(ScoreCol);

		Data.load();

		if (kind == 0) {
			this.setItems(TopScoreObservableList.get());

			for (int i = 0; i < 10 && i < Data.scores.size(); i++) {
				TopScoreObservableList.get().add(Data.scores.get(i));
			}

			TopScoreObservableList.setTable(this);

		} else if (kind == 1) {
			this.setItems(RecentScoreObservableList.get());
			Data.sortByTime();
			for (int i = 0; i < 10 && i < Data.scores.size(); i++) {
				RecentScoreObservableList.get().add(Data.scores.get(i));
			}

			RecentScoreObservableList.setTable(this);
		}

	}

}
