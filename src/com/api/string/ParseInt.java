package com.api.string;

public class ParseInt {

	public static void main(String[] args) {
		//문자열을 primitive type으로 반환-Excel value 함수와 비슷함
		String word = "-12345";
		
		try {
			int number = Integer.parseInt(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("형식변환 오류입니다.");
		}
			
	}
}