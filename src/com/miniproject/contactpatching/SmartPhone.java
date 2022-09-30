package com.miniproject.contactpatching;

import java.util.Scanner;

public class SmartPhone {

	Contact[] contacts; //Ÿ��[] ����
	Scanner in;
	int countOfContact = 0; //�迭 ���� �ʱ�ȭ

	//constructor
	public SmartPhone() {
		contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	//method-�ߺ� ���� Ȯ��
	boolean testContact(Contact contact) {
		
		//ù ��° �����ʹ� if���� ���, �� ��° �����ͺ��� �迭�� ����ó ��
		if(countOfContact > 0) {
			for(int i=0; i<countOfContact; i++) {
				if(contacts[i].getPhoneNumber().contentEquals(contact.getPhoneNumber())) {
					System.out.println("@@@@@@�ߺ��� ��ȣ�� �Է��ϼ̽��ϴ�. �ߺ����� ���� ��ȣ�� ����ó ����� ��õ��ϼ���.@@@@@@@");
					System.out.println(">>>�����Ͱ� ������� �ʾҽ��ϴ�. ���� ����� ����ó ����: ("+countOfContact+")");
					return true;
				}
			} //for�� ����	
		}
		return false;
	}
	
	//�迭�� ����ó ����
	void addContact(Contact contact) {
		
		//�ߺ��̸� �ٷ� �޼ҵ� ����
		if(testContact(contact) == true) {
			return;
		}
		
		//������ ��� ������ �ߺ��� �ƴϱ⿡ ����ó ���
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">>>�����Ͱ� ����Ǿ����ϴ�. ("+countOfContact+")");

	}
	
	//���� Ȯ��
	void testString(String a) {
		while(a.indexOf(" ")!=-1) {
			
		}
	}
	
	//Ű����� �Է� �޾� �迭 ����
	public Contact inputContactData(int selectNumber) {
		//�⺻ ���� �Է�
		String name;
		String phoneNumber;
		String mail;
		String address;
		String birthday;
		String group;

		System.out.print("�̸�: ");
		name = in.nextLine();
		
		//�Էµ� ���ڿ��� ������ �ִ��� Ȯ��
		while(name.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("�̸�: ");
			name = in.nextLine();
		}
		
		System.out.print("��ȭ��ȣ: ");
		phoneNumber = in.nextLine();
		while(phoneNumber.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("��ȭ��ȣ: ");
			phoneNumber = in.nextLine();
		}
		
		System.out.print("�̸���: ");
		mail = in.nextLine();
		while(mail.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("�̸���: ");
			mail = in.nextLine();
		}
		
		System.out.print("�ּ�: ");
		address = in.nextLine();
		while(address.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("�ּ�: ");
			address = in.nextLine();
		}
		
		System.out.print("����: ");
		birthday = in.nextLine();
		while(birthday.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("����: ");
			birthday = in.nextLine();
		}
		
		System.out.print("�׷�: ");
		group = in.nextLine();
		while(group.indexOf(" ")!=-1) {
			System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("�׷�: ");
			group = in.nextLine();
		}
		
		Contact contact = null;
		
		if(selectNumber == 1) {
			System.out.print("ȸ��: ");
			String company = in.nextLine();
			
			System.out.print("�μ�: ");
			String depart = in.nextLine();
			
			System.out.print("����: ");
			String job = in.nextLine();

		//��ĳ�ʷ� �Է¹��� �������� ���ο� Contact ��ü ���� �� �ǵ�����
			contact = new CompanyContact(name, phoneNumber, mail, address, birthday, group, company, depart, job);
		
		}else if(selectNumber == 2) {
			System.out.print("�ŷ�ó: ");
			String company = in.nextLine();
			
			System.out.print("�ŷ�ǰ��: ");
			String product = in.nextLine();
			
			System.out.print("����: ");
			String job = in.nextLine();
			
			contact = new CustomerContact(name, phoneNumber, mail, address, birthday, group, company, product, job);		
		}
		
		return contact;
	}

	//��ü ���� ���
	void printContact(Contact contact) {
		System.out.println("----------------------------------------------");
//		contact.printInfo(); //��� ���� ����� ����ϴ� ���� �޼���
		contact.showData();
		System.out.println("----------------------------------------------");	
	}
	
	//��� ����ó ���
	void printAllContact() {
		for(int i=0; i<countOfContact; i++) {
			printContact(contacts[i]);
		}
	}
	
	//����ó �˻�
	public void searchContact(String name) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}
	
	//����ó ����
	public void deleteContact(String name) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				for(int j=i; j<countOfContact; j++) {
					contacts[j]=contacts[j+1];			
				}
				countOfContact--;
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}
	
	//����ó ����
	public void editContact(String name) {
		
		for(int i=0; i<countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {		
				System.out.println("1.ȸ�� | 2.�ŷ�ó");
				System.out.print(">> �׷�(�Ҽ�)�� �������ּ���. ");
				int selectNumber = in.nextInt();
				in.nextLine(); //���� �����
				contacts[i] = inputContactData(selectNumber);
				addContact(contacts[i]); //�ߺ�Ȯ��	
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
		return;
	}
	
		
}
