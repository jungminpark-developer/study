package gui.swing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx3 extends JFrame{
	JLabel label;
	
	EventEx3(){
		//component 생성
		label = new JLabel();
		label.setBounds(10, 10, 200, 10);
		Button botton = new Button("click here");
		botton.setBounds(20, 20, 100, 35);
		
		botton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("익명객체를 이용한 이벤트");
			}
		});
			
		add(botton);
		add(label);
		setSize(160, 120);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new EventEx3();	
	}
}
