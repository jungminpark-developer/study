package com.api.string;

public class ParseInt {

	public static void main(String[] args) {
		//문자열을 정수로 반환
		
		String word = "-12345ㅋ";
		
		try {
			int number = Integer.parseInt(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("형식변환 오류입니다.");
		}
		
		
		
	}

}
