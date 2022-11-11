package codingtest.lv0;

public class TriangleSides {

	public int solution(int[] sides) {
		// 삼각형의 완성 조건-프로그래머스 0단계
		int max = 0;
		int Side = 0;

		// 가장 큰 변 저장
		for (int i = 0; i < sides.length; i++) {
			if (sides[i] >= max) {
				max = sides[i];
			}
			Side += sides[i]; // 세 변의 합 저장
		}

		// 결과 리턴
		if (max < Side - max) { // 가장 큰 변 < 세 변의 합-가장 큰 변=두 변의 합
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		// 실행
		TriangleSides test = new TriangleSides();
		int[] tryAngle = { 3, 3, 3 };

		System.out.println(test.solution(tryAngle));
	}
}