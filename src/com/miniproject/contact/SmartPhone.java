package com.miniproject.contact;

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
	
	//�迭�� ����ó ����
	void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">>>�����Ͱ� ����Ǿ����ϴ�. ("+countOfContact+")");
		}	
	
	//Ű����� �Է� �޾� �迭 ����
	public Contact inputContactData(int selectNumber) {
		//�⺻ ���� �Է�
		System.out.print("�̸�: ");
		String name = in.nextLine();
		
		System.out.print("��ȭ��ȣ: ");
		String phoneNumber = in.nextLine();
		
		System.out.print("�̸���: ");
		String mail = in.nextLine();
		
		System.out.print("�ּ�: ");
		String address = in.nextLine();
		
		System.out.print("����: ");
		String birthday = in.nextLine();
		
		System.out.print("�׷�: ");
		String group = in.nextLine();
		
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
		contact.printInfo();
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
	public void editContact(String name, Contact newContact) {
		for(int i=0; i<countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i]=newContact;
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}
	
		
}
