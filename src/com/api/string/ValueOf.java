package com.api.string;

public class ValueOf {

	public static void main(String[] args) {
		//���ڿ��� ������ ��ȯ-Excel value �Լ��� �����
		String word = "18712345";
		
		try {
			Integer number = Integer.valueOf(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("���ĺ�ȯ �����Դϴ�.");
		}	
		
		int a = 29;
		String word2 = String.valueOf(a);
		System.out.println(word2);
		
	}
}
