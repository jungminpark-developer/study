package gui.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJBottonEx1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JBotton을 이용한 버튼 생성"); //JFrame의 인스턴스 생성
		
		JButton b = new JButton("버튼 Click"); //JButton 인스턴스 생성
		b.setBounds(120, 50, 100, 40); //만들어진 윈도우 상에서 x축,y축,너비,높이
		frame.add(b); //JFrame에 버튼 추가
		
		frame.setSize(350,170); //윈도우의 사이즈
		frame.setLayout(null); //레이아웃 관리자를 사용하지 않음
		frame.setVisible(true); //프레임을 화면에 표시
	}

}
