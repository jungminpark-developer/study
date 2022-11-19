package codingtest.lv1;

public class HarshadNumber {

	public boolean solution(int x) {
		// 하샤드 수-프로그래머스 1단계
		int sum = 0; // 자릿수의 합계
		String temp = Integer.toString(x); // 자릿수의 합계를 구하기 위해 임시로 저장할 곳

		// 10 이하의 자연수는 반드시 하샤드 수이다.
		if (x <= 10) {
			return true;
		}

		// 자릿수의 합계 구하기
		for (int i = 0; i < temp.length(); i++) {
			sum += Integer.parseInt(temp.substring(i, i + 1));
		}

		// 하샤드 수인지 판단
		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}

	}
}