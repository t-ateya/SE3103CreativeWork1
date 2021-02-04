package controller;

import view.CoursePanel;
import view.MenuScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.CourseDatabase;

public class CourseEventListener implements ActionListener {

	private CoursePanel panel;

	public CourseEventListener(CoursePanel panel) {
		this.panel = panel;
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
		}else if (button == panel.getEnrollButton()){

		}

	}

}
