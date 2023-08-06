package guiTest;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyFrame() {
		ImageIcon image = new ImageIcon("indir.jpg");

		JLabel label = new JLabel();
		label.setText("Bro do you even code");
		label.setIcon(image);

		this.setTitle("Here is the this");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.CYAN);
		this.add(label);
	}
}
