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
	int j; // 반복수
	
	//키보드로 입력 받아 객체를 생성
	void inputContactData() {
		System.out.println("데이터 2개를 입력합니다. (몇 개 입력하실?) ");
		System.out.print("최대 10개까지 입력 가능합니다. ");
		j = sc.nextInt(); // 몇 명 입력받는지
		System.out.println("*데이터를 " + j + "개까지 입력합니다.");
	}
	
	//배열에 연락처 저장-파라미터 버전 몰랑
	void addContact2(Contact contact) {
		
	}
	
	
	//배열에 연락처 저장-스캐너 버전 성공
	void addContact() {
		for(i=0; i<j; i++) {
			System.out.println((i+1) + "번째 정보를 입력합니다.");
			
			System.out.print("이름: ");
			name = sc.next();
			
			System.out.print("전화번호: ");
			phoneNumber = sc.next();
			
			System.out.print("이메일: ");
			mail = sc.next();
			
			System.out.print("주소: ");
			address = sc.next();
			
			System.out.print("생일: ");
			birthday = sc.next();
			
			System.out.print("그룹: ");
			group = sc.next();
			
			contact[i] = new Contact(name, phoneNumber, mail, address, birthday, group);
		}	
	}
	
//	void addContact() {
//		
//	}
	
	//객체 정보 출력
	void printContact(Contact contact) {
		System.out.println(contact);
		
	}
	
	//모든 연락처 출력
	void printAllContact() {
		System.out.println("---------------"); //구분선
		for(i=0; i<j; i++) {
			contact[i].printInfo();
			System.out.println(">>> 데이터가 저장되었습니다.(" + (i+1) + ")");
		}
	
	}
	
	
	
	
	
		
}
