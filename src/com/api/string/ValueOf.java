package com.api.string;

public class ValueOf {

	public static void main(String[] args) {
		//���ڿ��� object�� ��ȯ-Excel value �Լ��� �����
		String word = "221104";
		
		try {
			Integer number = Integer.valueOf(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("���ĺ�ȯ �����Դϴ�.");
		}	
		
		int number = 29;
		String word2 = String.valueOf(number);
		System.out.println(word2);
		
	}
}