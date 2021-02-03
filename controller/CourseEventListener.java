package controller;

import view.CoursePanel;
import view.MenuScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
		//System.out.println(button.getText());

		if (button == panel.getExitButton()){
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();
		}

	}

	

	

}
