package model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;

public class CoursePanel {
	private JFrame window;

	public CoursePanel(JFrame window){
		this.window = window;
	}

	private JButton viewCourseButton = new JButton("View Course");
	private JButton enrollButton = new JButton("Enroll");
	private JButton exitButton = new JButton("Exit");
	private JButton enterButton = new JButton("Enter");
	private JScrollPane jScrollPanel = new JScrollPane();

	private JTextArea messageArea = new JTextArea();


	private CourseCanvas canvas;

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));
		cp.add(BorderLayout.CENTER, southPanel);

		JPanel south1 = new JPanel();
		south1.add(new JLabel("Type Here: "));

		messageArea.setColumns(20);
		messageArea.setRows(5);
		jScrollPanel.setViewportView(messageArea);

		south1.add(jScrollPanel);
		southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(viewCourseButton);
		south2.add(enrollButton);
		south2.add(enterButton);
		south2.add(exitButton);
		southPanel.add(south2);

		//create Canvas
		canvas = new CourseCanvas(this);




	}

	
	
}
