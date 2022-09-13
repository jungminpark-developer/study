package GitHub;

import java.util.ArrayList;

public class SportCar extends Car {
	//field
	private float chargingFuel = 0;
	
	//Getter-�� �ʱ�ȭ(?���� ��?)
	public float getchargingFuel() {
		return chargingFuel;
	}
	
	//Method-��ȸ�� ���� ����
	//���������� ������ �� ���� �����ִ� ���ᷮ�� Ȯ���ϴ� �޼��� ���
	protected void chargingFuel(float extraFuel){
		if(extraFuel < 10) {
			System.out.println("���ּ� 10 �̻��� ���Ḧ �����ϼ���.\n");
			return;
		}else if(chargingFuel + extraFuel > 100) {
			System.out.println("���ִ� ���ᷮ�� �ʰ��߽��ϴ�.\n");
			return;
		}else {
			this.chargingFuel += extraFuel;
			System.out.println("���̹��� ä�� ���ᷮ: " + extraFuel);
		}
		System.out.println("�����ִ� ���ᷮ: " + chargingFuel + "\n");
	}
	
	//ArrayList

	
	//Method-�ν��� ���
	protected void useSpeedBooster() {
		chargingFuel = chargingFuel-10;
		System.out.println("�غν��ͷ� ���� 10�� ����߽��ϴ�.");
		System.out.println("�����ִ� ���ᷮ: " + chargingFuel + "\n");
	}
	
	//Method-�ǽð� ���ᷮ Ȯ�� ���
	protected void remainingFuel() {
		System.out.println("������ ���ᷮ�� Ȯ���մϴ�.");
		System.out.println("�ǽð� ���ᷮ Ȯ��: " + chargingFuel + "\n");
	}
}
	

