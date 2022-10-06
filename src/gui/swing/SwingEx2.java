package gui.swing;

import javax.swing.*;

public class SwingEx2 extends JFrame{

	JFrame frame;
	
	SwingEx2(){
		JFrame frame = new JFrame(); //JFrame의 인스턴스 생성
		
		JButton b = new JButton("버튼"); //JButton의 인스턴스 생성
		
		b.setBounds(50, 25, 100, 30); //x축, y축, 너비, 높이
		
		frame.add(b); //JFrame에 버튼 추가
		
		frame.setSize(200, 120); //폭200, 높이100
		frame.setLayout(null); //레이아웃 관리자를 사용하지 않음
		frame.setVisible(true); //프레임을 화면에 표시
	
	}
	
	public static void main(String[] args) {
		
		new SwingEx2();
		
	}
}
