package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;


public class Course {
	private String title;
	private String CRN;
	private static final String CLASSROOM_SESSION = "CLASSROOM";
	private static final String ONLINE_SESSION = "ONLINE";

	public Course(String title, String CRN){
		this.title = title;
		this.CRN = CRN;

	}
	
	public String getCRN() {
		return CRN;
	}

	public void setCRN(String CRN) {
		this.CRN = CRN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public String printCourseInfo() {
		return "Course Title: " + title + "\n" +
				"Course CRN: " + CRN;
	}

	

	

	

	public void render(Graphics2D g2){
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 14));
		g2.drawString(title, 50, 100);
	}
	
}
