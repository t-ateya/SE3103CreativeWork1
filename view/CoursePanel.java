package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CourseEventListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class CoursePanel {
	private JFrame window;
	private CourseCanvas courseCanvas;
	private EnrolledCourseCanvas enrolledCourseCanvas;

	private JButton viewCourseButton = new JButton("View Offerred Courses");
	private JButton previousCourseButton = new JButton("Previous Course");
	private JButton viewEnrolledCoursesButton = new JButton("View Enrolled Courses");
	private JButton exitButton = new JButton("Exit");
	private JButton enrollButton = new JButton("Enroll");
	private JTextField cRNField = new JTextField(7);

	public CoursePanel(JFrame window) {
		this.window = window;
	}

	public EnrolledCourseCanvas getEnrolledCourseCanvas() {
		return enrolledCourseCanvas;
	}

	public CourseCanvas getCourseCanvas() {
		return courseCanvas;
	}

	public void setCourseCanvas(CourseCanvas courseCanvas) {
		this.courseCanvas = courseCanvas;
	}

	public JButton getViewEnrolledCoursesButton() {
		return viewEnrolledCoursesButton;
	}

	public void setViewEnrolledCoursesButton(JButton viewEnrolledCoursesButton) {
		this.viewEnrolledCoursesButton = viewEnrolledCoursesButton;
	}

	public JTextField getCRNField() {
		return cRNField;
	}

	public void setCRNField(JTextField cRNField) {
		this.cRNField = cRNField;
	}

	public JButton getEnrollButton() {
		return enrollButton;
	}

	public void setEnrollButton(JButton enrollButton) {
		this.enrollButton = enrollButton;
	}

	public JButton getPreviousCourseButton() {
		return previousCourseButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getViewCourseButton() {
		return viewCourseButton;
	}

	public JFrame getWindow() {
		return window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));

		cp.add(BorderLayout.SOUTH, southPanel);

		JPanel south1 = new JPanel();
		south1.add(new JLabel("INPUT CRN: "));
		south1.add(cRNField);
		south1.add(enrollButton);
		southPanel.add(south1);
		//messageArea.setColumns(20);
		//messageArea.setRows(5);
		//jScrollPane.setViewportView(messageArea);

		//south1.add(jScrollPane);
		//southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(previousCourseButton);
		south2.add(viewCourseButton);
		south2.add(viewEnrolledCoursesButton);
		south2.add(exitButton);
		southPanel.add(south2);

		//Create a Course Canvas
		courseCanvas = new CourseCanvas(this);
		courseCanvas.removeAll();
		cp.add(BorderLayout.EAST, courseCanvas);

		//Create Enrolled Course Canvae
		enrolledCourseCanvas = new EnrolledCourseCanvas(this);
		enrolledCourseCanvas.removeAll();
		cp.add(BorderLayout.WEST, enrolledCourseCanvas);

		//courseCanvas = new CourseCanvas(this);
		//courseCanvas.removeAll();
		//cp.add(BorderLayout.CENTER, courseCanvas);
		
		CourseEventListener listener = new CourseEventListener(this);
		previousCourseButton.addActionListener(listener);
		viewCourseButton.addActionListener(listener);
		enrollButton.addActionListener(listener);
		viewEnrolledCoursesButton.addActionListener(listener);
		exitButton.addActionListener(listener);

	}


	
}
