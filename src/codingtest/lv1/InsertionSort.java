package codingtest.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

	public long solution(long n) {
		// 정수 내림차순으로 배치하기-프로그래머스 1단계
		ArrayList<Long> array = new ArrayList<>();
		long answer = 0;

		// 자리수 분리
		while (n > 0) {
			array.add(n % 10);
			n = n / 10;
		}

		// 삽입 정렬로 오름차순 정렬
		for (int i = 1; i < array.size(); i++) { // 두 번째인 1번 인덱스부터 비교
			for (int j = i; j > 0; j--) {
				if (array.get(j - 1) > array.get(j)) {
					Collections.swap(array, j, j - 1);
				}
			}
		}

		// 자릿수를 곱해서 최종값 만들기
		int timesNumber = 1;
		for (int i = 0; i < array.size(); i++) {
			answer += array.get(i) * timesNumber;
			timesNumber *= 10;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		InsertionSort test = new InsertionSort();
		test.solution(546271);
		
String answer = "";
String s=" try hello world";

		char a = 32;
		System.out.println("공백 =" + a);
	
        
        for (int i=0; i<s.length(); i++) {
             if (i % 2 == 0) {
                 answer += s.charAt(i) - 32;
             } else {
                 answer += s.charAt(i);
             }
             
             
	}
	}
}