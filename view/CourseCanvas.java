package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;



public class CourseCanvas extends JPanel {

	private CoursePanel panel;

	public CourseCanvas(CoursePanel panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

	public CoursePanel getPanel() {
		return panel;
	}

	public void setPanel(CoursePanel panel) {
		this.panel = panel;
	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D)g;
		//CourseController controller= new CourseController();
		//controller.render(g2);

	}

	

	
	
}
