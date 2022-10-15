package com.api.string;

public class ValueOf {

	public static void main(String[] args) {
		//문자열을 정수로 반환-Excel value 함수와 비슷함
		String word = "18712345";
		
		try {
			Integer number = Integer.valueOf(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("형식변환 오류입니다.");
		}	
		
		int a = 29;
		String word2 = String.valueOf(a);
		System.out.println(word2);
		
	}
}
