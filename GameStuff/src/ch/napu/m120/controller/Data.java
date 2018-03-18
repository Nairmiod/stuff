package ch.napu.m120.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import ch.napu.m120.model.Score;

public class Data {

	public static ArrayList<Score> scores;
	private static String connectionString = "jdbc:mysql://localhost/score?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static void load() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			scores = new ArrayList<Score>();
			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

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
			conn.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void sortByTime() {

		Collections.sort(scores);
	}
}
