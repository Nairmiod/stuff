package ch.napu.m120.launcher.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class Data {

	public static ArrayList<Score> scores;
	private static String connectionString = "jdbc:mysql://localhost/score?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";
	private static Connection conn;

	public static void load() {
		try {

			if (conn == null)
				openConnection();

			scores = new ArrayList<Score>();

			Statement stat = conn.createStatement();

			ResultSet rs = stat.executeQuery("SELECT * FROM score ORDER BY scrTime LIMIT 0, 15");

			int rank = 1;
			while (rs.next()) {
				String scrName = rs.getString("scrName");
				int scrScore = rs.getInt("scrScore");
				String scrTime = rs.getString("scrTime");

				scores.add(new Score(rank, scrName, scrScore, scrTime));
				rank++;
			}

			rs.close();
			stat.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void sortByTime() {

		Collections.sort(scores);
	}

	public static void save(Score s) throws ClassNotFoundException, SQLException {

		if (conn == null)
			openConnection();
		Statement stat = conn.createStatement();
		stat.executeQuery("INSERT INTO score (scrName,scrScore) VALUES ('" + s.getName() + "'," + s.getScore() + ")");

	}

	public static void openConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
	}

	public static void closeConnection() throws SQLException {
		conn.close();
	}
}
