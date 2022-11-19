package codingtest.lv0;

import java.util.ArrayList;

public class PrimeFactorization {

	public int[] solution(int n) {
		// 소인수 분해-프로그래머스 0단계
		int[] result = {};
		int arrayLength = 0; // 배열의 길이를 지정
		ArrayList<Integer> array = new ArrayList<>(); // 소수를 임시 저장

		for (int i = 2; i <= n; i++) {

			// i가 소인수 분해가 된다면 결과값을 저장하고 배열 길이 증가
			if (n % i == 0) {
				arrayLength++;
				array.add(i);
			}

			// i로 나눠지지 않을 때까지 반복문 수행
			while (n % i == 0) {
				n /= i;
			}
		}

		// 저장된 소수를 최종값에 저장
		result = new int[arrayLength];
		for (int i = 0; i < result.length; i++) {
			result[i] = array.get(i);
		}

		return result;
	}
}