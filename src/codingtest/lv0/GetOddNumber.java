package codingtest.lv0;

public class GetOddNumber {

	public int[] solution(int n) {
		// 짝수는 싫어요-프로그래머스 0단계
		int count = 0;
		if (n % 2 == 0) {
			count = n / 2;
			n--;
		} else {
			count = n / 2 + 1;
		}

		int[] answer = new int[count];
		int j = 1;

		for (int i = 0; i < answer.length; i++) {
			answer[i] = j;
			j += 2;
		}

		return answer;
	}
}