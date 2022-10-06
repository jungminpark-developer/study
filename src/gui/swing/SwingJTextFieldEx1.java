package gui.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJTextFieldEx1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing JTextField 예제");
		
		JTextField t1, t2;
		
		t1 = new JTextField("Swing Component를 사용합니다.");
		t1.setBounds(20, 10, 200, 30);
		
		t2 = new JTextField("Swing JTextField");
		t2.setBounds(20, 50, 200, 30);
		
		frame.add(t1);
		frame.add(t2);
		
		frame.setSize(300, 150);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
