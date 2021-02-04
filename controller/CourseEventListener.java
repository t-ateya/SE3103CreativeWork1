package controller;

import view.CoursePanel;
import view.MenuScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


import model.CourseDatabase;
import model.Student;

public class CourseEventListener implements ActionListener {
	private Student student;
	private CoursePanel panel;

	public CourseEventListener(CoursePanel panel) {
		this.panel = panel;
	}

	public CourseEventListener(Student student) {
		this.student = student;
	}

	public CoursePanel getPanel() {
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if (button == panel.getExitButton()) {
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();
		} else if (button == panel.getViewCourseButton()) {
			int index = panel.getCourseCanvas().getCourseIndex();
			++index;
			if (index == CourseDatabase.CoursesOfferred.size()) {
				index = 0;
			}
			panel.getCourseCanvas().setCourseIndex(index);
			panel.getCourseCanvas().repaint();
		} else if (button == panel.getPreviousCourseButton()) {
			int index = panel.getCourseCanvas().getCourseIndex();
			--index;
			if (index < 0) {
				index = CourseDatabase.CoursesOfferred.size();
			}
			panel.getCourseCanvas().setCourseIndex(index);
			panel.getCourseCanvas().repaint();
		} else if (button == panel.getEnrollButton()) {
			String message = panel.getCRNField().getText();
			if (message.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(panel.getWindow(), "Sorry! Must Enter CRN to enroll");
			} else {
				String CRN = panel.getCRNField().getText();
				student = new Student();
				student.enrollEncourse(CRN);
			}
			panel.getCRNField().setText(" ");

		} 

	}

}
