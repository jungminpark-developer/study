package codingtest.lv0;

public class StringToCase {

	public String solution(String my_string) {
		// 대문자와 소문자-프로그래머스 0단계
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 97) {
				answer += (char) (my_string.charAt(i) - 32);
			} else {
				answer += (char) (my_string.charAt(i) + 32);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// 실행
		StringToCase test = new StringToCase();
		System.out.println(test.solution("abcABC"));

	}
}
