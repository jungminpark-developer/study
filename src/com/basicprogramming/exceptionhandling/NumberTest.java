package com.basicprogramming.exceptionhandling;

import java.util.Scanner;

public class NumberTest {

	public static void main(String[] args){
		//참고: https://iwbtbitj.tistory.com/44
		
		try {
			//키보드로 숫자 입력 받기
			System.out.print("태어난 년도를 4자리의 숫자로 입력해주세요> ");
			Scanner sc = new Scanner(System.in);
			String year = sc.nextLine();
			
			data(inputData(year));
		}catch(InputException e) {
			String message = e.getMessage(); //예외 메세지 얻기
			System.out.println(message);
			e.printStackTrace(); //예외 추적 후 콘솔에 출력
		}
		
	}
	
	public static boolean inputData(String year){
		//숫자만 입력했는지 문자도 입력했는지 여부 확인
		try {
			Integer.parseInt(year);
			return true;
		}catch(NumberFormatException e){
			return false;
		}

	}

	public static void data(boolean year) throws InputException{
		
		if(year) {
			System.out.println("입력하신 데이터는 숫자입니다.");
		}else {
			throw new InputException("입력하신 데이터는 숫자가 아닙니다."); //사용자 정의 예외 발생
		}
		
	}
		
}
