package gui.swing;

import javax.swing.JFrame;

import java.awt.Button;

import javax.swing.BoxLayout;

public class SwingBoxLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("BoxLayout ����");
		Button buttons[];
		
		buttons = new Button[5];
		for(int i=0; i<5; i++) {
			buttons[i] = new Button("Button "+(i+1));
			frame.add(buttons[i]);
		}
		
		//�����ӿ� �߰��Ǵ� ���۳�Ʈ���� Ư���� �������� �����ϱ�
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS)); //x�� ��ġ
//		frame.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS)); //y�� ��ġ
		frame.setSize(350, 150);
		frame.setVisible(true);
		
		
		
	}
}
