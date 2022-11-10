package codingtest.lv1;

public class TheSumBetweenTwoIntegers {

	public long solution(int a, int b) {
		// 두 정수 사이의 합-프로그래머스 1단계
		long answer = 0;

		if (a == b) {
			return a;
		}

		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		TheSumBetweenTwoIntegers test = new TheSumBetweenTwoIntegers();
		System.out.println(test.solution(5, 3));
	}
}