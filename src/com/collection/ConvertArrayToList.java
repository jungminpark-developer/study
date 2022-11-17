package com.collection;

import java.util.ArrayList;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// 221117 Array(배열) -> List
		int[] array = { 7, 3, 1 };
		ArrayList<Integer> arrayList = new ArrayList<>();

		// 1. for문
		for (int temp : array) {
			arrayList.add(temp);
		}

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		// arrayList의 모든 요소 제거
		arrayList.clear();

	}
}