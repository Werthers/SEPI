package view;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class screen extends JPanel{
	private static final long serialVersionUID = 1L;
	private menu menu;
	static JFrame launch = new JFrame("Zuma");
	
	public screen() throws IOException {
		menu = new menu();
	}

	public menu getM() {
		return menu;
	}

	public JFrame getF() { 
		return launch;
	}

	public void launchFrame() throws IOException {
		launch.setLocation(400, 0);
		launch.setSize(1000,800);
		launch.add(this.getM());
		launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launch.setResizable(false);
		launch.setVisible(true);
	}
}
