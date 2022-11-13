package codingtest.lv1;

public class MakingStrangeText {

	public String solution(String s) {
		// 이상한 문자 만들기-프로그래머스 1단계-매우 복잡하게 풀었다.
		String answer = "";
		boolean even = true;

		for (int i = 0; i < s.length(); i++) {
			// i번째 인덱스의 글자가 공백일 경우
			if (s.charAt(i) == 32) {
				even = true;
				answer += s.charAt(i);
				continue;
			}

			if (even) {
				// 짝수 인덱스의 글자가 소문자가 아닐 경우(대문자일 경우)
				if (s.charAt(i) < 97) {
					answer += s.charAt(i);
				} else {
					answer += (char) (s.charAt(i) - 32);
				}
			} else {
				// 홀수 인덱스의 글자가 소문자가 아닐 경우(대문자일 경우)
				if (s.charAt(i) < 97) {
					answer += (char) (s.charAt(i) + 32);
				} else {
					answer += s.charAt(i);
				}
			}

			even = !even;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		MakingStrangeText test = new MakingStrangeText();
		System.out.println(test.solution("  tRy hello  WORLD    "));
	}
}