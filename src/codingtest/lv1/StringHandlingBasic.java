package codingtest.lv1;

public class StringHandlingBasic {

	public boolean solution(String s) {
		// 문자열 다루기 기본-프로그래머스 1단계
		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 65) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// 실행
		StringHandlingBasic test = new StringHandlingBasic();
		System.out.print(test.solution("1234"));
	}
}