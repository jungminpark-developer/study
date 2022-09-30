package com.miniproject.contactpatching;

import java.util.Scanner;

public class SmartPhoneMain {

	public void printMenu() {
		System.out.println("Contact--------------------------------");
		System.out.println(">> 1.����ó ���(ȸ��)");
		System.out.println(">> 2.����ó ���(�ŷ�ó)");
		System.out.println(">> 3.��� ����ó ���");
		System.out.println(">> 4.����ó �˻�");
		System.out.println(">> 5.����ó ����");
		System.out.println(">> 6.����ó ����");
		System.out.println(">> 7.���α׷� ����");
		System.out.print(">> �޴��� �������ּ���. ");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();

		//���� �� �� �Է�
		System.out.println("# ������ 2���� �Է��մϴ�.");
		for(int i=0; i<2; i++) {
			System.out.println("1.ȸ�� | 2.�ŷ�ó");
			System.out.print(">> �׷�(�Ҽ�)�� �������ּ���. ");
			int selectNumber = sc.nextInt();
			smartPhone.addContact(smartPhone.inputContactData(selectNumber));
		}
		
		while(true) {
			SmartPhoneMain smartPhoneMain = new SmartPhoneMain();
			smartPhoneMain.printMenu();
			String choiceMenu = sc.nextLine();
			
			if(choiceMenu.equals("1")) { //1.����ó ���(ȸ��)
				smartPhone.addContact(smartPhone.inputContactData(1));
			}else if(choiceMenu.equals("2")) { //1.����ó ���(�ŷ�ó)
				smartPhone.addContact(smartPhone.inputContactData(2));	
			}else if(choiceMenu.equals("3")) { //3.��� ����ó ���
				smartPhone.printAllContact();
			}else if(choiceMenu.equals("4")) { //4.����ó �˻�
				System.out.println("�˻��ϰ����ϴ� �̸��� �Է����ּ���.");
				smartPhone.searchContact(sc.nextLine());
			}else if(choiceMenu.equals("5")) { //5.����ó ����
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���.");
				smartPhone.deleteContact(sc.nextLine());
			}else if(choiceMenu.equals("6")) { //6.����ó ����
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				String name = sc.nextLine();
				smartPhone.editContact(name);
				
//				System.out.println("�����͸� ���� �Է����ּ���. �˻� ����� ���� ��� �Է��� ��ҵ˴ϴ�.");
//				System.out.println("1.ȸ�� | 2.�ŷ�ó");
//				System.out.print(">> �׷�(�Ҽ�)�� �������ּ���. ");
			}else if(choiceMenu.equals("7")) { //6.���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else{
				System.out.println("�߸��� �޴��Դϴ�. �ٽ� �������ּ���.");
			}
			
		}//while�� ����
		
		
	}
}
