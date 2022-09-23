package com.miniproject.contact;

import java.util.Scanner;

public class SmartPhoneMain {

	public void printMenu() {
		System.out.println("Contact--------------------------------");
		System.out.println(">> 1.����ó ���");
		System.out.println(">> 2.��� ����ó ���");
		System.out.println(">> 3.����ó �˻�");
		System.out.println(">> 4.����ó ����");
		System.out.println(">> 5.����ó ����");
		System.out.println(">> 6.���α׷� ����");
		System.out.print(">> �޴��� �������ּ���. ");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();

		//���� �� �� �Է�
		System.out.println("# ������ 2���� �Է��մϴ�.");
		for(int i=0; i<2; i++) {
			System.out.print(">> �׷��� �������ּ���. ");
			int selectNumber = sc.nextInt();
			smartPhone.addContact(smartPhone.inputContactData(selectNumber));
		}
		
		while(true) {
			SmartPhoneMain smartPhoneMain = new SmartPhoneMain();
			smartPhoneMain.printMenu();
			String choiceMenu = sc.nextLine();
			
			if(choiceMenu.equals("1")) { //1.����ó ���
				System.out.print(">> �׷��� �������ּ���. ");
				int selectNumber = sc.nextInt();
				smartPhone.addContact(smartPhone.inputContactData(selectNumber));
			}else if(choiceMenu.equals("2")) { //2.��� ����ó ���
				smartPhone.printAllContact();
			}else if(choiceMenu.equals("3")) { //3.����ó �˻�
				System.out.println("�˻��ϰ����ϴ� �̸��� �Է����ּ���.");
				smartPhone.searchContact(sc.nextLine());
			}else if(choiceMenu.equals("4")) { //4.����ó ����
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���.");
				smartPhone.deleteContact(sc.nextLine());
			}else if(choiceMenu.equals("5")) { //5.����ó ����
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				String name = sc.nextLine();
				System.out.println("�����͸� ���� �Է����ּ���.");
				System.out.print(">> �׷��� �������ּ���. ");
				int selectNumber = sc.nextInt();
				smartPhone.editContact(name, smartPhone.inputContactData(selectNumber));
			}else if(choiceMenu.equals("6")) { //6.���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else{
				System.out.println("�߸��� �޴��Դϴ�. �ٽ� �������ּ���.");
			}
			
		}//while�� ����
		
		
	}
}
