package com.api.string;

public class Replace {

	public static void main(String[] args) {
		//221012 ���ڿ� API-���ڿ� ����
		String word = "�� ���α׷���";
		word = word.replace("��", "Web");
		System.out.println(word);
		
		String word2 = "�����ϳ�V���ֱ�";
		word2 = word2.replace("V", "");
		System.out.println(word2);
		
	}
}
