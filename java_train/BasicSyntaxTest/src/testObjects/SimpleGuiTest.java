// Simple GUI
package testObjects;

import javax.swing.JOptionPane;


public class SimpleGuiTest {

	public static void main(String[] args) {
		String name  = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age);
	}

}
