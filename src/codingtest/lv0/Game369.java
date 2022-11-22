package codingtest.lv0;

public class Game369 {

	public int solution(int order) {
		// 369게임-프로그래머스 0단계
		int answer = 0;
		String number = String.valueOf(order);

		char[] array = number.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '3' || array[i] == '6' || array[i] == '9') {
				answer++;
			}
		}

		return answer;
	}
}