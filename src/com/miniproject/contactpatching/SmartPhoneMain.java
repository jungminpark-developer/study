package com.miniproject.contactpatching;

import java.util.Scanner;

public class SmartPhoneMain {

	public void printMenu() {
		System.out.println("Contact--------------------------------");
		System.out.println(">> 1.연락처 등록(회사)");
		System.out.println(">> 2.연락처 등록(거래처)");
		System.out.println(">> 3.모든 연락처 출력");
		System.out.println(">> 4.연락처 검색");
		System.out.println(">> 5.연락처 삭제");
		System.out.println(">> 6.연락처 수정");
		System.out.println(">> 7.프로그램 종료");
		System.out.print(">> 메뉴를 선택해주세요. ");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();

		//정보 두 개 입력
		System.out.println("# 데이터 2개를 입력합니다.");
		for(int i=0; i<2; i++) {
			System.out.println("1.회사 | 2.거래처");
			System.out.print(">> 그룹(소속)을 선택해주세요. ");
			int selectNumber = sc.nextInt();
			smartPhone.addContact(smartPhone.inputContactData(selectNumber));
		}
		
		while(true) {
			SmartPhoneMain smartPhoneMain = new SmartPhoneMain();
			smartPhoneMain.printMenu();
			String choiceMenu = sc.nextLine();
			
			if(choiceMenu.equals("1")) { //1.연락처 등록(회사)
				smartPhone.addContact(smartPhone.inputContactData(1));
			}else if(choiceMenu.equals("2")) { //1.연락처 등록(거래처)
				smartPhone.addContact(smartPhone.inputContactData(2));	
			}else if(choiceMenu.equals("3")) { //3.모든 연락처 출력
				smartPhone.printAllContact();
			}else if(choiceMenu.equals("4")) { //4.연락처 검색
				System.out.println("검색하고자하는 이름을 입력해주세요.");
				smartPhone.searchContact(sc.nextLine());
			}else if(choiceMenu.equals("5")) { //5.연락처 삭제
				System.out.println("삭제하고자하는 이름을 입력해주세요.");
				smartPhone.deleteContact(sc.nextLine());
			}else if(choiceMenu.equals("6")) { //6.연락처 수정
				System.out.println("수정하고자하는 이름을 입력해주세요");
				String name = sc.nextLine();
				smartPhone.editContact(name);
				
//				System.out.println("데이터를 새로 입력해주세요. 검색 결과가 없을 경우 입력이 취소됩니다.");
//				System.out.println("1.회사 | 2.거래처");
//				System.out.print(">> 그룹(소속)을 선택해주세요. ");
			}else if(choiceMenu.equals("7")) { //6.프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			}else{
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
			
		}//while문 종료
		
		
	}
}
