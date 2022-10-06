package gui.swing;

import javax.swing.JFrame;

import java.awt.Button;

import javax.swing.BoxLayout;

public class SwingBoxLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("BoxLayout 예제");
		Button buttons[];
		
		buttons = new Button[5];
		for(int i=0; i<5; i++) {
			buttons[i] = new Button("Button "+(i+1));
			frame.add(buttons[i]);
		}
		
		//프레임에 추가되는 컴퍼넌트들을 특정축 방향으로 나열하기
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS)); //x축 배치
//		frame.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS)); //y축 배치
		frame.setSize(350, 150);
		frame.setVisible(true);
		
		
		
	}
}
