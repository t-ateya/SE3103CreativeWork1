package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.Course;
import model.CourseDatabase;

public class CourseCanvas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private CoursePanel panel;
	private int courseIndex = -1;
	public CourseCanvas(CoursePanel panel) {
		this.setPanel(panel);
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

	public CoursePanel getPanel() {
		return panel;
	}

	public void setPanel(CoursePanel panel) {
		this.panel = panel;
	}

	public int getCourseIndex() {
		return courseIndex;
	}

	public void setCourseIndex(int courseIndex) {
		this.courseIndex = courseIndex;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (courseIndex >= 0){
			Graphics2D g2 = (Graphics2D)g;
			Course c = CourseDatabase.CoursesOfferred.get(courseIndex);
			c.render(g2);
		}

	}
	

	

	
	
}
