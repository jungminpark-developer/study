package gui.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJBottonEx1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JBotton�� �̿��� ��ư ����"); //JFrame�� �ν��Ͻ� ����
		
		JButton b = new JButton("��ư Click"); //JButton �ν��Ͻ� ����
		b.setBounds(120, 50, 100, 40); //������� ������ �󿡼� x��,y��,�ʺ�,����
		frame.add(b); //JFrame�� ��ư �߰�
		
		frame.setSize(350,170); //�������� ������
		frame.setLayout(null); //���̾ƿ� �����ڸ� ������� ����
		frame.setVisible(true); //�������� ȭ�鿡 ǥ��
	}

}
