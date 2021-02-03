package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;


public class Course {
	private CourseDatabase courseData;
	private String title;
	private String CRN;
	private static final String CLASSROOM_SESSION = "AVAILABLE";
	private static final String ONLINE_SESSION = "AVAILABLE";
	private static String NOT_AVAILABLE_SESSION = "NOT AVAILABE";

	public Course(){

	}
	public Course(String title, String CRN, String Onlinesession, String classroomSession){
		this.title = title;
		this.CRN = CRN;

	}

	public void diplayCourse(){
		System.out.println("Course Title: " + title + "\n"
							+ "CRN: " + CRN +
							"\nOnline Session: " + getOnlineSession()+
							"\nIn class Session: " + getClassroomSession());
		
	}
	
	public static String getNOT_AVAILABLE_SESSION() {
		return NOT_AVAILABLE_SESSION;
	}
	
	public static String getClassroomSession() {
		return CLASSROOM_SESSION;
	}

	public static String getOnlineSession() {
		return ONLINE_SESSION;
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


	public void render(Graphics2D g2){
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 14));
		g2.drawString(title, 50, 100);
	}
	
}
