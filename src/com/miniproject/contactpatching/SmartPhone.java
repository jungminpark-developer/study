package com.miniproject.contactpatching;

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
	
	//method-중복 여부 확인
	boolean testContact(Contact contact) {
		
		//첫 번째 데이터는 if문을 통과, 두 번째 데이터부터 배열에 연락처 비교
		if(countOfContact > 0) {
			for(int i=0; i<countOfContact; i++) {
				if(contacts[i].getPhoneNumber().contentEquals(contact.getPhoneNumber())) {
					System.out.println("@@@@@@중복된 번호를 입력하셨습니다. 중복되지 않은 번호로 연락처 등록을 재시도하세요.@@@@@@@");
					System.out.println(">>>데이터가 저장되지 않았습니다. 현재 저장된 연락처 개수: ("+countOfContact+")");
					return true;
				}
			} //for문 종료	
		}
		return false;
	}
	
	//배열에 연락처 저장
	void addContact(Contact contact) {
		
		//중복이면 바로 메소드 종료
		if(testContact(contact) == true) {
			return;
		}
		
		//위에줄 통과 했으면 중복이 아니기에 연락처 등록
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">>>데이터가 저장되었습니다. ("+countOfContact+")");

	}
	
	//공백 확인
	void testString(String a) {
		while(a.indexOf(" ")!=-1) {
			
		}
	}
	
	//키보드로 입력 받아 배열 생성
	public Contact inputContactData(int selectNumber) {
		//기본 정보 입력
		String name;
		String phoneNumber;
		String mail;
		String address;
		String birthday;
		String group;

		System.out.print("이름: ");
		name = in.nextLine();
		
		//입력된 문자열에 공백이 있는지 확인
		while(name.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("이름: ");
			name = in.nextLine();
		}
		
		System.out.print("전화번호: ");
		phoneNumber = in.nextLine();
		while(phoneNumber.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("전화번호: ");
			phoneNumber = in.nextLine();
		}
		
		System.out.print("이메일: ");
		mail = in.nextLine();
		while(mail.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("이메일: ");
			mail = in.nextLine();
		}
		
		System.out.print("주소: ");
		address = in.nextLine();
		while(address.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("주소: ");
			address = in.nextLine();
		}
		
		System.out.print("생일: ");
		birthday = in.nextLine();
		while(birthday.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("생일: ");
			birthday = in.nextLine();
		}
		
		System.out.print("그룹: ");
		group = in.nextLine();
		while(group.indexOf(" ")!=-1) {
			System.out.println("공백을 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("그룹: ");
			group = in.nextLine();
		}
		
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
//		contact.printInfo(); //모든 정보 출력을 담당하던 원래 메서드
		contact.showData();
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
	public void editContact(String name) {
		
		for(int i=0; i<countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {		
				System.out.println("1.회사 | 2.거래처");
				System.out.print(">> 그룹(소속)을 선택해주세요. ");
				int selectNumber = in.nextInt();
				in.nextLine(); //버퍼 비우기용
				contacts[i] = inputContactData(selectNumber);
				addContact(contacts[i]); //중복확인	
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return;
	}
	
		
}
