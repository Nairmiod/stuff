package ch.napu.m120.shared.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Score implements Comparable<Score> {

	private String name;
	private int score;
	private int rank;
	private Date time;

	public Score(int rank, String name, int score, String scrTime) throws ParseException {
		super();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		this.name = name;
		this.score = score;
		this.rank = rank;
		this.setTime(format.parse(scrTime));

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public int compareTo(Score o) {

		Date s1 = this.getTime();
		Date s2 = o.getTime();
		if (s1.before(s2)) {
			return 1;
		} else if (s1.after(s2)) {
			return -1;
		} else {
			return 0;
		}

	}

}
