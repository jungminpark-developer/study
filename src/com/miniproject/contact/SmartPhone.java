package com.miniproject.contact;

import java.util.Scanner;

public class SmartPhone {

	Contact[] contacts; //타입[] 변수
	Scanner in;
	int countOfContact = 0; //배열 개수 초기화

	//constructor
	public SmartPhone() {
		contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	//배열에 연락처 저장
	void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">>>데이터가 저장되었습니다. ("+countOfContact+")");
		}	
	
	//키보드로 입력 받아 배열 생성
	public Contact inputContactData(int selectNumber) {
		//기본 정보 입력
		System.out.print("이름: ");
		String name = in.nextLine();
		
		System.out.print("전화번호: ");
		String phoneNumber = in.nextLine();
		
		System.out.print("이메일: ");
		String mail = in.nextLine();
		
		System.out.print("주소: ");
		String address = in.nextLine();
		
		System.out.print("생일: ");
		String birthday = in.nextLine();
		
		System.out.print("그룹: ");
		String group = in.nextLine();
		
		Contact contact = null;
		
		if(selectNumber == 1) {
			System.out.print("회사: ");
			String company = in.nextLine();
			
			System.out.print("부서: ");
			String depart = in.nextLine();
			
			System.out.print("직급: ");
			String job = in.nextLine();

		//스캐너로 입력받은 내용으로 새로운 Contact 객체 생성 후 되돌려줌
			contact = new CompanyContact(name, phoneNumber, mail, address, birthday, group, company, depart, job);
		
		}else if(selectNumber == 2) {
			System.out.print("거래처: ");
			String company = in.nextLine();
			
			System.out.print("거래품목: ");
			String product = in.nextLine();
			
			System.out.print("직급: ");
			String job = in.nextLine();
			
			contact = new CustomerContact(name, phoneNumber, mail, address, birthday, group, company, product, job);		
		}

		 return contact;
	}

	//객체 정보 출력
	void printContact(Contact contact) {
		System.out.println("----------------------------------------------");
		contact.printInfo();
		System.out.println("----------------------------------------------");	
	}
	
	//모든 연락처 출력
	void printAllContact() {
		for(int i=0; i<countOfContact; i++) {
			printContact(contacts[i]);
		}
	}
	
	//연락처 검색
	public void searchContact(String name) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	//연락처 삭제
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
		System.out.println("검색 결과가 없습니다.");
	}
	
	//연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i=0; i<countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i]=newContact;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
		
}
