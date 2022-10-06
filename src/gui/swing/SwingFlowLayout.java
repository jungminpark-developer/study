package gui.swing;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class SwingFlowLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("FlowLayout 예제");
		
		JButton b1 = new JButton("ABCDE");
		JButton b2 = new JButton("A");
		JButton b3 = new JButton("C");
		JButton b4 = new JButton("D");
		JButton b5 = new JButton("Egg");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); //오른쪽 정렬
		frame.setSize(500,75);
		frame.setVisible(true);
	}

}
