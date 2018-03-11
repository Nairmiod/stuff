package ch.napu.m120.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class RecentScoreObservableList {

	private static String connectionString = "jdbc:mysql://localhost/score?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";
	
	private final static ObservableList<Score> data = FXCollections.observableArrayList();

	public static TableView<Score> table = null ;

	public static void loadData(){
		try {
			
		Class.forName("com.mysql.jdbc.Driver");

		
		Connection conn = DriverManager.getConnection(connectionString,connectionUser,connectionPassword);
		
		Statement stat = conn.createStatement();
		
		ResultSet rs = stat.executeQuery("SELECT scrName, scrScore FROM score ORDER BY scrTime LIMIT 0, 15");
				
		
		while (rs.next()) {
			String scrName = rs.getString("scrName");
			int scrScore = Integer.parseInt(rs.getString("scrScore"));
			
			//TODO: ranking
			int rank = 0;
			data.add(new Score(rank, scrName, scrScore));
		}
		
		rs.close();
		stat.close();
		conn.close();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		
	}
	
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
