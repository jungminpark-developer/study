package com.miniproject.contactpatching;

public class CompanyContact extends Contact{
	
	//field
	String company; //ȸ��
	String depart; //�μ�
	String job; //����
	
	//constructor
	public CompanyContact(String name, String phoneNumber, String mail, String address, String birthday, String group) {
		super(name, phoneNumber, mail, address, birthday, group);
	}
	
	public CompanyContact(String name, String phoneNumber, String mail, String address, String birthday, String group,
			String company, String depart, String job) {
		super(name, phoneNumber, mail, address, birthday, group);
		this.company = company;
		this.depart = depart;
		this.job = job;
	}
		
	//Method-���� ���
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("ȸ��: " + company);
		System.out.println("�μ�: " + depart);
		System.out.println("����: " + job);	
	}
	
	
	
}
