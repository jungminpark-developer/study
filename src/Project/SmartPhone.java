package Project;

import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Contact[] contact = new Contact[10];
	
	String name;
	String phoneNumber;
	String mail;
	String address;
	String birthday;
	String group;
	
	int i;
	int j; // �ݺ���
	
	//Ű����� �Է� �޾� ��ü�� ����
	void inputContactData() {
		System.out.println("������ 2���� �Է��մϴ�. (�� �� �Է��Ͻ�?) ");
		System.out.print("�ִ� 10������ �Է� �����մϴ�. ");
		j = sc.nextInt(); // �� �� �Է¹޴���
		System.out.println("*�����͸� " + j + "������ �Է��մϴ�.");
	}
	
	//�迭�� ����ó ����-�Ķ���� ���� ����
	void addContact2(Contact contact) {
		
	}
	
	
	//�迭�� ����ó ����-��ĳ�� ���� ����
	void addContact() {
		for(i=0; i<j; i++) {
			System.out.println((i+1) + "��° ������ �Է��մϴ�.");
			
			System.out.print("�̸�: ");
			name = sc.next();
			
			System.out.print("��ȭ��ȣ: ");
			phoneNumber = sc.next();
			
			System.out.print("�̸���: ");
			mail = sc.next();
			
			System.out.print("�ּ�: ");
			address = sc.next();
			
			System.out.print("����: ");
			birthday = sc.next();
			
			System.out.print("�׷�: ");
			group = sc.next();
			
			contact[i] = new Contact(name, phoneNumber, mail, address, birthday, group);
		}	
	}
	
//	void addContact() {
//		
//	}
	
	//��ü ���� ���
	void printContact(Contact contact) {
		System.out.println(contact);
		
	}
	
	//��� ����ó ���
	void printAllContact() {
		System.out.println("---------------"); //���м�
		for(i=0; i<j; i++) {
			contact[i].printInfo();
			System.out.println(">>> �����Ͱ� ����Ǿ����ϴ�.(" + (i+1) + ")");
		}
	
	}
	
	
	
	
	
		
}
