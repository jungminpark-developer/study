package com.api.string;

public class ParseInt {

	public static void main(String[] args) {
		//���ڿ��� primitive type���� ��ȯ-Excel value �Լ��� �����
		String word = "-12345";
		
		try {
			int number = Integer.parseInt(word);
			System.out.println(number);
		}catch(NumberFormatException ex) {
			System.out.println("���ĺ�ȯ �����Դϴ�.");
		}
			
	}
}