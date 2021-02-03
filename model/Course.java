package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;


public class Course {
	private CourseDatabase courseData;
	private String title;
	private String CRN;
	private String AVAILABE_SESSION = "ONLINE";
	
	

	public Course(){

	}
	public Course(String title, String CRN, String session){
		this.title = title;
		this.CRN = CRN;
		AVAILABE_SESSION = session;

	}

	public void diplayCourse(){
		System.out.println("\n-------------COURSE INFORMATION----------------");
		System.out.println("Course Title: " + title + "\n"
							+ "CRN: " + CRN +
							"\nSession: " + AVAILABE_SESSION
							);
		
	}

	public  String getAVAILABE_SESSION() {
		return AVAILABE_SESSION;
	}

	public void setAVAILABE_SESSION(String session) {
		AVAILABE_SESSION = session;
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
