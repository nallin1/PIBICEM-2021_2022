import java.awt.*; import javax.swing.*;

public class Exercicio7 {
	private static void createWindow() {
		JFrame frame = new JFrame("Simple Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); 
		textLabel.setPreferredSize(new Dimension(300, 100));
		
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createWindow();
	}
}
