package codingtest.lv0;

public class TellApartSquareNumber {

	public int solution(int n) {
		// 제곱수 판별하기-프로그래머스 0단계
		// 다른 사람의 풀이를 보고 추가 공부
		if (Math.sqrt(n) % 1 == 0) {
			return 1;
		} else {
			return 2;
		}

		/*
		 * // 성공한 첫 풀이 for (int i = 1; i <= Math.sqrt(n); i++) { if (Math.pow(i, 2) ==
		 * n) { return 1; } }
		 * 
		 * return 2;
		 */
	}
}