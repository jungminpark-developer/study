package gui.swing;

import javax.swing.*;

public class SwingEx2 extends JFrame{

	JFrame frame;
	
	SwingEx2(){
		JFrame frame = new JFrame(); //JFrame�� �ν��Ͻ� ����
		
		JButton b = new JButton("��ư"); //JButton�� �ν��Ͻ� ����
		
		b.setBounds(50, 25, 100, 30); //x��, y��, �ʺ�, ����
		
		frame.add(b); //JFrame�� ��ư �߰�
		
		frame.setSize(200, 120); //��200, ����100
		frame.setLayout(null); //���̾ƿ� �����ڸ� ������� ����
		frame.setVisible(true); //�������� ȭ�鿡 ǥ��
	
	}
	
	public static void main(String[] args) {
		
		new SwingEx2();
		
	}
}
