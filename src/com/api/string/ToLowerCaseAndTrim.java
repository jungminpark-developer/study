package com.api.string;

public class ToLowerCaseAndTrim {

	public static void main(String[] args) {
		//220924 ���ڿ� API
		
		String word = "AaBbCc";
		System.out.println(word.toLowerCase());
		
		String word2 = "aabbcc";
		System.out.println(word2.toUpperCase());
		
		String word3 = "    �� �� ��     ��";
		System.out.println(word3);
		System.out.println(word3.trim());
	
	}
}
