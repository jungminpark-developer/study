package codingtest.lv0;

public class RockPaperScissors {

	public String solution(String rsp) {
		// 가위바위보-프로그래머스 0단계
		String answer = "";

		for (int i = 0; i < rsp.length(); i++) {
			switch (rsp.charAt(i)) {
			case '2':
				answer += "0";
				break;
			case '0':
				answer += "5";
				break;
			case '5':
				answer += "2";
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		RockPaperScissors test = new RockPaperScissors();
		System.out.println(test.solution("205"));
	}

}
