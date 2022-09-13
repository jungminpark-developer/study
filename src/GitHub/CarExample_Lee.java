package GitHub;

import java.util.ArrayList;
import java.util.Scanner;

public class CarExample_Lee {

	static ArrayList<Car> list = new ArrayList<Car>(); //��ü ����
	static Scanner sc = new Scanner(System.in); //�� �޼ҵ忡�� Ű����� �Է� �ޱ�

	//Method-���� ���α׷�
	static void menuPlay() {
		int selectNo; //�޴� ����-��ĳ�ʷ� �Է¹��� ���� ����

		while(true) { //���ѷ���-4�� ������ return���� �޼ҵ尡 ����Ǿ� ��������
			System.out.println("--------------------------------------");
			System.out.println(" 1.�����Է� | 2.��ü��ȸ | 3.�˻���ȸ | 4.����");
			System.out.println("--------------------------------------");
			System.out.print("��� ����> ");
		
		selectNo = sc.nextInt(); // ������ ��ȣ �Է�
			
		switch(selectNo) {
			case 1: //Ű����� �����Է� �ޱ�
				regCar();
				break;
			case 2: //��� ������ȸ
				showCar();
				break;
			case 3: //�ڵ��� �˻�
				serchCar();	
				break;
			case 4: //���α׷� ����
				exitProgram();
				return;			
			default:
				System.out.println("-�޴��� ���� ��ȣ�� �Է��߽��ϴ�.");
				System.out.println("-1������ 4���� �ٽ� �Է��ϼ���.\n");
			} //switch�� ����	
		} //while�� ����	
	}

	//Method-������ Ű����� �Է��Ͽ� ����
	static void regCar() {
		SportCar tmp = new SportCar();
		
		String tmp_carModelName;
		int tmp_carMaxSpeed;
		int tmp_carModelNo;

		System.out.println("\n<���� �Է�>");
	  	System.out.print("-�ڵ��� �� ��ȣ�� �Է��ϼ���. ");
		tmp_carModelNo = sc.nextInt();
		System.out.print("-�ڵ��� �𵨸��� �Է��ϼ���. ");
		tmp_carModelName = sc.next();
		System.out.print("-�ִ� �ӵ��� �Է��ϼ���. ");
		tmp_carMaxSpeed = sc.nextInt();
		tmp.setCarInfo(tmp_carModelNo, tmp_carModelName, tmp_carMaxSpeed);//Car Ŭ������ Setter ���

		//����Ʈ����� .add() �� �������ָ��.
		list.add(tmp);
		System.out.println("������� " + list.size() + "���� ������ ���������� �Է��߽��ϴ�.\n");
	}

	//Method-����� ��� ������ ���
	static void showCar() {
		System.out.println("\n<��ü ��ȸ>");
		for(int i=0; i<list.size(); i++) {
		System.out.println((i+1) + "�� ��� �ڵ���");
		list.get(i).showCarInfo(); //�����̳� -> �ڵ���������(get) -> �ڵ����������(put_Car_Info)	
		System.out.println();
		}
	}

	//Method-���α׷� ����, ���� �Ը𿡼� ���ʿ�������, ���߿� Ȯ���� ����� �̸� ����
	//����)�����ͺ��̽� ����, ����ϴ� �޸� û�� �� 
	static void exitProgram() {
		System.out.println("-���α׷��� �����մϴ�.");
	}

	//Method-�˻� ���, �˻��� ������ ���
	static void serchCar() {

		int searchByModelNo; //�˻�� �𵨹�ȣ�� ��� ���
		String searchByModelName; //�˻�� ���̸��� ��� ���
		int searchByMaxSpeed; //�˻�� �ִ�ӵ��� ��� ���
		
		System.out.println("\n<�˻� ��ȸ>");
		System.out.println("--------------------------------------");
		System.out.println(" 1.�ڵ����𵨹�ȣ | 2.�ڵ����𵨸� | 3.�ִ�ӵ� ");
		System.out.println("--------------------------------------");
		System.out.print("�˻� ��� ����> ");
		int searchCategory = sc.nextInt();//�ڵ������̸�

		//�˻��� ���� ����ΰ��� ���� �з�
		switch(searchCategory) {
			case 1:
			    System.out.print("�ڵ��� �� ��ȣ �Է�> ");//�˻��ϰ���� �𵨹�ȣ�Է�
		    	searchByModelNo = sc.nextInt();	//
		    	//�˻��Ͽ� ������ ��
		    	for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getModelNo()==searchByModelNo) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
		      	break;
			case 2:
			    System.out.print("�ڵ��� �𵨸� �Է�> ");
			  	searchByModelName = sc.next();	//�˻��ϰ���� ���̸��Է�
			  	//�˻��Ͽ� ������ ��
				for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getModelName().equals(searchByModelName)) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
		    	break;
			case 3:
			  	System.out.print("�ִ� �ӵ� �Է�> ");//�˻��ϰ���� �ִ�ӵ��Է�
			  	searchByMaxSpeed = sc.nextInt();	 
		    	//�˻��Ͽ� ������ ��
			  	for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getMaxSpeed()==searchByMaxSpeed) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
			  	break;
	  		default:
	  			System.out.println("-�޴��� ���� ��ȣ�� �Է��߽��ϴ�.");
				System.out.println("-1������ 3���� �ٽ� �Է��ϼ���.\n");
		  }	//switch�� ����	
		System.out.println(); //�ٹٲ�(����)
	}

	public static void main(String[] args) {
		//���� ���α׷� ����
		menuPlay();
	}
}
