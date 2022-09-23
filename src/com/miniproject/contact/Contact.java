package com.miniproject.contact;

public class Contact {
	
	//field
	private String name;
	private String phoneNumber; //���ڷ� �޾Ƽ� ���� �Ҽ��� ����
	private String mail;
	private String address;
	private String birthday;
	private String group;
		
	//constructor
	Contact(String name, String PhoneNumber, String mail, String address, String birthday, String group){
		this.name = name;
		this.phoneNumber = PhoneNumber;
		this.mail = mail;
		this.address = address;
		this.birthday = birthday;
		this.group = group;		
	}
	
	//getter And setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	//Method-�׷� ���� ����
	void changeGroupInfo() {
		if(group.equals("����")) {
			group = "ģ��";
		}else {
			group = "����";
		}
	}

	//Method-���� ���
	void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phoneNumber);
		System.out.println("�̸���: " + mail);
		System.out.println("�ּ�: " + address);
		System.out.println("����: " + birthday);
		System.out.println("�׷�: " + group);	
	}
}



