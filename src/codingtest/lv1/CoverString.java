package codingtest.lv1;

public class CoverString {

	public String solution(String phone_number) {
		// 핸드폰 번호 가리기-프로그래머스 1단계
		String answer = "";
		String asterisk = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
			asterisk += "*";
		}

		answer = phone_number.replace(phone_number.substring(0, phone_number.length() - 4), asterisk);

		return answer;

		/*
		 * //다른 사람의 풀이 보고 추가 공부 String answer = "";
		 * 
		 * for(int i=0; i < phone_number.length()-4; i++) { answer += "*"; }
		 * 
		 * answer += phone_number.substring(phone_number.length()-4);
		 * 
		 * return answer;
		 */
	}

	public static void main(String[] args) {
		// 실행
		CoverString test = new CoverString();
		System.out.print(test.solution("027778888"));

	}
}