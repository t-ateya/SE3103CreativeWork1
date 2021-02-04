package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CourseEventListener;

import java.awt.BorderLayout;
import java.awt.Container;

public class CoursePanel {
	private JFrame window;
	private CourseCanvas canvas;
	private JButton viewCourseButton = new JButton("View Course");
	private JButton previousCourseButton = new JButton("Previous Course");
	private JButton exitButton = new JButton("Exit");
	// private JScrollPane jScrollPane = new JScrollPane();

	// private JTextArea messageArea = new JTextArea();

	public CoursePanel(JFrame window) {
		this.window = window;
	}

	public JButton getPreviousCourseButton() {
		return previousCourseButton;
	}

	
	public CourseCanvas getCanvas() {
		return canvas;
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
		//southPanel.setLayout(new GridLayout(2, 1));

		cp.add(BorderLayout.SOUTH, southPanel);

		JPanel south = new JPanel();
		//south1.add(new JLabel("Type here: "));

		//messageArea.setColumns(20);
		//messageArea.setRows(5);
		//jScrollPane.setViewportView(messageArea);

		//south1.add(jScrollPane);
		//southPanel.add(south1);

		//JPanel south2 = new JPanel();
		south.add(viewCourseButton);
		south.add(previousCourseButton);
		south.add(exitButton);
		southPanel.add(south);

		//Create a Canvas
		canvas = new CourseCanvas(this);
		canvas.removeAll();
		cp.add(BorderLayout.CENTER, canvas);

		CourseEventListener listener = new CourseEventListener(this);
		viewCourseButton.addActionListener(listener);
		previousCourseButton.addActionListener(listener);
		exitButton.addActionListener(listener);

	}


	
}
