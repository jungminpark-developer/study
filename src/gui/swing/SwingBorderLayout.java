package gui.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBorderLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("BorderLayout 예제");
		
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");
		
		f.add(b1, BorderLayout.NORTH); //b1을 북쪽에 배치
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		f.setSize(250,150);
		f.setVisible(true);
			
	}
}
