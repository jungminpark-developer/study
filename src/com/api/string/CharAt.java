package com.api.string;

public class CharAt {

	public static void main(String[] args) {
		//220924 ���ڿ� API-charAt()
		
		String word = "pjm";
		char a = word.charAt(0);
		System.out.println(""+a+a);
		
		char b = word.charAt(1);
		System.out.println(b);

		char c = word.charAt(2);
		System.out.println(c);
		
		String subject = "�ڹ� ���α׷���";
		char charValue = subject.charAt(3);
		System.out.println(charValue);

		/* ����-index out of range: 3, �ε����� ������ ���
		char d = word.charAt(3);
		System.out.println(d);
		*/
			
	}
}
