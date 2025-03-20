import javax.swing.*;

public class Test extends JPanel {
	
	Test() {
		JFrame frame = new JFrame("Hello");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(this);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
