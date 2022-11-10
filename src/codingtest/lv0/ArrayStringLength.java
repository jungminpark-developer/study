package codingtest.lv0;

public class ArrayStringLength {

	public int[] solution(String[] strlist) {
		// 배열 원소의 길이-프로그래머스 0단계
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		/*
		 * 출력 확인 용도 for(int i=0; i<answer.length; i++){ System.out.println(answer[i]); }
		 */

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		ArrayStringLength test = new ArrayStringLength();
		String[] strlist = { "We", "are", "the", "world!", "ㅋㅋ" };

		test.solution(strlist);

	}
}