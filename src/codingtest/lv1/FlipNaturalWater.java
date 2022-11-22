package codingtest.lv1;

public class FlipNaturalWater {

	public int[] solution(long n) {
		// 자연수 뒤집어 배열로 만들기-프로그래머스 1단계

		String length = "" + n; // String에 n 추가
		int[] answer = new int[length.length()]; // String의 글자수 길이의 배열 생성

		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n % 10); // (int) n % 10 은 실패-공부하기
			n /= 10;
		}

		return answer;
	}
}