package codingtest.lv1;

public class ConditionalCalcul {

	public long solution(int price, int money, int count) {
		// 부족한 금액 계산하기-프로그래머스 1단계
		long answer = 0;

		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}

		if (answer <= money) {
			return 0;
		} else {
			return answer - money;
		}

	}
}