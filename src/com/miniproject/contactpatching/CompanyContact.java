package com.miniproject.contactpatching;

public class CompanyContact extends Contact{
	
	//field
	String company; //회사
	String depart; //부서
	String job; //직급
	
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
		
	//Method-정보 출력
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("회사: " + company);
		System.out.println("부서: " + depart);
		System.out.println("직급: " + job);	
	}
	
	
	
}
