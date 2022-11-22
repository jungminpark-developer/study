package codingtest.lv0;

public class IndexOfTest {

	public int solution(String str1, String str2) {
		// 문자열안에 문자열-프로그래머스 0단계
		// 제출답안
		if (str1.indexOf(str2) != -1) {
			return 1;
		} else {
			return 2;
		}

		/*
		 * 답안 보고 contains 발견, 공부 후 시도 if(str1.contains(str2)) { return 1; }else { return
		 * 2; }
		 */
	}

	public static void main(String[] args) {
		// 실행
		IndexOfTest test = new IndexOfTest();
		System.out.println(test.solution("ab6CDE443fgh", "6CD"));
		System.out.println(test.solution("ppprrrrogrammers", "pppp"));
	}
}