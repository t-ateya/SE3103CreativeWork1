package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class MenuScreen {
	private JFrame window;

	public MenuScreen(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(400, 200));

		JButton courseButton = new JButton("CHECK AND ENROLL COURSES");
		menuPanel.add(courseButton);

		cp.add(BorderLayout.CENTER, menuPanel);

		courseButton.addActionListener(event->{
			window.getContentPane().removeAll();
			var panel = new CoursePanel(window);
			panel.init();
			window.pack();
			window.revalidate();
		});
	}

	
}
