package codingtest.lv1;

import java.util.ArrayList;

public class RemoveContinuedNumbers2 {

	public int[] solution(int[] arr) {
		// 같은 숫자는 싫어-프로그래머스 1단계
		/*
		 * 두 번째 시도-성공 고쳐야할 점: 직전의 데이터만 검사할 때 굳이 변수를 만든 점, 인덱스를 활용할 수 있었다.
		 */

		ArrayList<Integer> answer = new ArrayList<>();

		int tempNumber = arr[0]; // 최근 데이터를 저장하여 비교
		answer.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == tempNumber) {
				continue;
			} else {
				tempNumber = arr[i];
				answer.add(tempNumber);
			}
		}

		int[] answer2 = new int[answer.size()];
		for (int i = 0; i < answer2.length; i++) {
			answer2[i] = answer.get(i);
		}

		return answer2;
	}
}