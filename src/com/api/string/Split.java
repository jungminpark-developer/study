package com.api.string;

public class Split {

	public static void main(String[] args) {
		//221012 ���ڿ� API-���ڿ� �и��Ͽ� �迭�� ����
		String word = "12345";
		String[] array;
		
		array = word.split("");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
