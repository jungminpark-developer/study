package codingtest.lv0;

import java.util.Arrays;

public class TriangleSidesRetry {

	public int solution(int[] sides) {
		// 삼각형의 완성 조건(정렬 API 사용)-프로그래머스 0단계
		Arrays.sort(sides);

		if (sides[2] < sides[0] + sides[1]) {
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		// 실행
		TriangleSidesRetry test = new TriangleSidesRetry();
		int[] tryAngle = { 7, 3, 3 };
		System.out.println(test.solution(tryAngle));
	}
}