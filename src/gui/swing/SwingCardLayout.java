package gui.swing;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SwingCardLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("CardLayout 예제");
		
		CardLayout card = new CardLayout(40, 30); //CardLayout 인스턴스 생성
		f.setLayout(card);
		
		JButton no1, no2, no3, no4;
		no1 = new JButton("클릭해보세요.");
		no2 = new JButton("첫 번째 카드");
		no3 = new JButton("두 번째 카드");
		no4 = new JButton("세 번째 카드");
		
		//익명클래스 형태로 이벤트 리스너 정의
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane()); //next()메소드로 다음 컨테이너로 넘김
			}
		};
			
		no1.addActionListener(listener);
		no2.addActionListener(listener);
		no3.addActionListener(listener);
		no4.addActionListener(listener);
		
		f.add(no1);
		f.add(no2);
		f.add(no3);
		f.add(no4);
		
		f.setSize(250,150);
		f.setVisible(true);
		
		
	}
	
	
}
