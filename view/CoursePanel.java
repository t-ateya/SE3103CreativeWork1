package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.CourseEventListener;

import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;

public class CoursePanel {
	private JFrame window;
	private CourseCanvas canvas;
	private JButton viewCourseButton = new JButton("View Course");
	private JButton enrollButton = new JButton("Enroll");
	private JButton exitButton = new JButton("Exit");
	private JButton enterButton = new JButton("Enter");
	private JScrollPane jScrollPane = new JScrollPane();

	private JTextArea messageArea = new JTextArea();

	public CoursePanel(JFrame window){
		this.window = window;
	}

	public CourseCanvas getCanvas() {
		return canvas;
	}
	public JButton getEnrollButton() {
		return enrollButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getViewCourseButton() {
		return viewCourseButton;
	}

	public JButton getEnterButton() {
		return enterButton;
	}

	public JTextArea getTextArea(){
		return messageArea;
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
		south1.add(new JLabel("Type here: "));

		messageArea.setColumns(20);
		messageArea.setRows(5);
		jScrollPane.setViewportView(messageArea);

		south1.add(jScrollPane);
		southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(viewCourseButton);
		south2.add(enrollButton);
		south2.add(exitButton);
		south2.add(enterButton);
		southPanel.add(south2);

		//Create a Canvas
		canvas = new CourseCanvas(this);
		canvas.removeAll();
		cp.add(BorderLayout.CENTER, canvas);

		CourseEventListener listener = new CourseEventListener(this);
		viewCourseButton.addActionListener(listener);
		enrollButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		enterButton.addActionListener(listener);


	}


	
}
