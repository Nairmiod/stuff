package ch.napu.m120.view;



import ch.napu.m120.model.RecentScoreObservableList;
import ch.napu.m120.model.Score;
import ch.napu.m120.model.TopScoreObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Rankings extends TableView<Score> {

	public Rankings(int kind){
		super();
		
		TableColumn<Score,String> RankCol = new TableColumn<Score,String>("Rank");
		RankCol.setCellValueFactory(new PropertyValueFactory<Score,String>("rank"));
		RankCol.setPrefWidth(50);
		
		TableColumn<Score,String> NameCol = new TableColumn<Score,String>("Name");
		NameCol.setCellValueFactory(new PropertyValueFactory<Score,String>("name"));
		NameCol.setPrefWidth(200);


		TableColumn<Score,String> ScoreCol = new TableColumn<Score,String>("Score");
		ScoreCol.setCellValueFactory(new PropertyValueFactory<Score,String>("score"));
		ScoreCol.setPrefWidth(200);

		
		this.getColumns().add(RankCol);
		this.getColumns().add(NameCol);
		this.getColumns().add(ScoreCol);
		
		
		if (kind == 0) {
			this.setItems(TopScoreObservableList.get());
			TopScoreObservableList.setTable(this);
			//TODO: Load Data
		} else if (kind == 1) {
			this.setItems(RecentScoreObservableList.get());
			RecentScoreObservableList.setTable(this);
			//TODO: Load Data
		} 
		

		
	}
}
