package codingtest.lv1;

public class NestedLoop {

	public int solution(int[] number) {
		// 삼총사-프로그래머스 1단계
		int answer = 0;

		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					if (number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}
