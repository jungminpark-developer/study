package com.api.string;

public class Replace {

	public static void main(String[] args) {
		//221012 문자열 API-문자열 길이
		String word = "웹 프로그래밍";
		word = word.replace("웹", "Web");
		System.out.println(word);
		
		String word2 = "글자하나V없애기";
		word2 = word2.replace("V", "");
		System.out.println(word2);
		
	}
}
