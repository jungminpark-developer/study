package com.collection;

import java.util.ArrayList;

public class ConvertListToArray {

	public static void main(String[] args) {
		// 221117 List -> Array(배열)
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(0);
		arrayList.add(3);

		// 1. for문
		int[] array = new int[arrayList.size()];
		int size = 0;

		for (int temp : arrayList) {
			array[size++] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 2. for문 + intValue()
		int[] array2 = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array2[i] = arrayList.get(i).intValue();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array2[i]);
		}

		// 3. stream().mapToInt() 로 하는 방법이 있는듯하니 추가 공부하기
		
//		toArray()-primitive type은 사용 불가
//		int[] array = arrayList.toArray(new int[arrayList.size()]);

	}
}