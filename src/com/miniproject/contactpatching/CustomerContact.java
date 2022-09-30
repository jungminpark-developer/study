package com.miniproject.contactpatching;

public class CustomerContact extends Contact {

	//field
	String company; //거래처 이름
	String product; //거래 품목
	String job; //직금
	
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
	
	//Method-정보 출력
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("거래처: " + company);
		System.out.println("거래품목: " + product);
		System.out.println("직급: " + job);	
	}
	
}
