package codingtest.lv0;

public class ArrayAvg {

	public double solution(int[] numbers) {
		// 배열의 평균값 구하기-프로그래머스 0단계
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}

		return answer / numbers.length;
	}
}