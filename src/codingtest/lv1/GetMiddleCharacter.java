package codingtest.lv1;

public class GetMiddleCharacter {

	public String solution(String s) {
		// 가운데 글자 가져오기-프로그래머스 1단계
		String answer = "";

		if (s.length() % 2 == 1) { // 글자수가 홀수라면
			answer += s.charAt(s.length() / 2);
		} else {
			answer += s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		GetMiddleCharacter test = new GetMiddleCharacter();
		System.out.println(test.solution("abcd"));
	}
}