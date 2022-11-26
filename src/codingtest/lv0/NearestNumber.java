package codingtest.lv0;

import java.util.Arrays;

public class NearestNumber {

	public int solution(int[] array, int n) {
		// 가까운 수-프로그래머스 0단계
		int answer = 0;
		int result = 100;

		// 오름차순으로 배열 정렬
		Arrays.sort(array);

		// 마지막 index부터 검사-두 수의 차이가 같다면 더 작은 수를 결과로 리턴
		for (int i = array.length - 1; i >= 0; i--) {
			if (Math.abs(n - array[i]) <= result) {
				result = Math.abs(n - array[i]);
				answer = array[i];
			}
		}

		return answer;
	}
}