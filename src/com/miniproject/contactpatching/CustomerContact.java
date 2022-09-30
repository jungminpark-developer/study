package com.miniproject.contactpatching;

public class CustomerContact extends Contact {

	//field
	String company; //�ŷ�ó �̸�
	String product; //�ŷ� ǰ��
	String job; //����
	
	//constructor
	public CustomerContact(String name, String phoneNumber, String mail, String address, String birthday, String group) {
		super(name, phoneNumber, mail, address, birthday, group);	
	}
	
	public CustomerContact(String name, String phoneNumber, String mail, String address, String birthday, String group,
			String company, String product, String job) {
		super(name, phoneNumber, mail, address, birthday, group);
		this.company = company;
		this.product = product;
		this.job = job;
	}
	
	//Method-���� ���
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("�ŷ�ó: " + company);
		System.out.println("�ŷ�ǰ��: " + product);
		System.out.println("����: " + job);	
	}
	
}
