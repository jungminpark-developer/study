package com.api.string;

public class ToCharArray {

	public static void main(String[] args) {
		//221027 ���ڿ� API-���ڿ��� char�� �迭�� ����
		String word = "Study with me";
		
		char[] array = word.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}