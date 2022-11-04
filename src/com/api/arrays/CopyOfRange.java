package com.api.arrays;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		//221104 배열 API-복사 및 정렬
		//첫 번째 매개변수로 복사의 대상이 될 배열을 전달 받음
		//두 번째 매개변수로는 배열에서 복사할 시작 인덱스를 전달받고
		//세 번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달 받음
		 
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