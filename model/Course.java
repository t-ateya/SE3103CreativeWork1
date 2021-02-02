package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Course {
	private String title;
	private String CRN;
	private Session courseSession;

	public Course(String title, String CRN, Session courSession){
		setCourseSession(courSession);
		this.title = title;
		this.CRN = CRN;
	}
	public void setCourseSession(Session courseSession) {
		this.courseSession = courseSession;
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

	public ArrayList<CourseInstructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<CourseInstructor> instructors) {
		this.instructors = instructors;
	}

	

	public void render(Graphics2D g2){
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 14));
		g2.drawString(title, 50, 100);
	}
	
}
