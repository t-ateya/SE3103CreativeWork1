package view;

import javax.swing.JFrame;

public class AppDrive {
	public static void main(String[] args) {
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(400, 100);
		window.setTitle("APPLICATION MENU");

		var menu = new MenuScreen(window);
		menu.init();
		
		window.pack();
		window.setVisible(true);
		
	}
	
}
