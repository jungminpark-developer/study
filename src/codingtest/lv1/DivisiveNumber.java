package codingtest.lv1;

import java.util.Arrays;

public class DivisiveNumber {

	public int[] solution(int[] arr, int divisor) {
		// 나누어 떨어지는 숫자 배열-프로그래머스 1단계
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				count++;
			}
		}

		if (count == 0) {
			int[] answer = { -1 };
			return answer;
		}

		int[] answer = new int[count];

		count = 0; // 인덱스로 쓰기위해 초기화

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[count] = arr[i];
				count++;
			}
		}

		Arrays.sort(answer);

		return answer;
	}
}