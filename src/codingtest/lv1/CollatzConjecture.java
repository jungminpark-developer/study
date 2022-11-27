package codingtest.lv1;

public class CollatzConjecture {

	public int solution(int num) {
		// 콜라츠 추측-프로그래머스 1단계
		int answer = 0;
		long number = num;

		if (num == 1) {
			return 0;
		}

		while (number != 1) {
			if (number % 2 == 0) {
				number /= 2;
				answer++;
			} else {
				number = number * 3 + 1;
				answer++;
			}

			if (answer == 500) {
				return -1;
			}

		}

		return answer;
	}
}