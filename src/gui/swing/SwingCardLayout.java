package gui.swing;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SwingCardLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("CardLayout ����");
		
		CardLayout card = new CardLayout(40, 30); //CardLayout �ν��Ͻ� ����
		f.setLayout(card);
		
		JButton no1, no2, no3, no4;
		no1 = new JButton("Ŭ���غ�����.");
		no2 = new JButton("ù ��° ī��");
		no3 = new JButton("�� ��° ī��");
		no4 = new JButton("�� ��° ī��");
		
		//�͸�Ŭ���� ���·� �̺�Ʈ ������ ����
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane()); //next()�޼ҵ�� ���� �����̳ʷ� �ѱ�
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
