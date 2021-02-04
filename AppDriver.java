import javax.swing.JFrame;

import view.MenuScreen;

public class AppDriver {
	public static void main(String[] args) {
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(400, 100);
		window.setTitle("STUDENT ENROLLMENT SYSTEM");

		var menu = new MenuScreen(window);
		menu.init();

		window.pack();
		window.setVisible(true);

	}

}
