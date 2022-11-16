package codingtest.lv2;

public class StackQueue {

	boolean solution(String s) {
		// 올바른 괄호-프로그래머스 2단계
		int count = 0; // Stack으로 사용할 변수

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			} else {
				count--;
			}

			if (count == -1) {
				return false;
			}
		} // for문 종료

		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}
}