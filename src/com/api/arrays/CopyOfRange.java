package com.api.arrays;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		//221104 �迭 API-���� �� ����
		//ù ��° �Ű������� ������ ����� �� �迭�� ���� ����
		//�� ��° �Ű������δ� �迭���� ������ ���� �ε����� ���޹ް�
		//�� ��° �Ű������δ� ���������� ����� �迭 ����� �ٷ� ���� �ε����� ���� ����
		 
		int[] array = { 7,6,5,1,2,9,8,3,4,0 };
		Arrays.sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		array = Arrays.copyOfRange(array, 3, 7);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}