package com.api.string;

public class CharAt {

	public static void main(String[] args) {
		//220924 문자열 API-charAt()
		
		String word = "pjm";
		char a = word.charAt(0);
		System.out.println(""+a+a);
		
		char b = word.charAt(1);
		System.out.println(b);

		char c = word.charAt(2);
		System.out.println(c);
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3);
		System.out.println(charValue);

		/* 오류-index out of range: 3, 인덱스가 범위를 벗어남
		char d = word.charAt(3);
		System.out.println(d);
		*/
			
	}
}
