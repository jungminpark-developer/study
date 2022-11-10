package codingtest.lv0;

public class ProductMax {

	public int solution2(int[] numbers) {
		// 최댓값 만들기(1)-프로그래머스 0단계-이중 for문 성공
		int max = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] * numbers[j] >= max) {
					max = numbers[i] * numbers[j];
				}
			}
		}

		return max;
	}

	public int solution(int[] numbers) {
		// 첫 시도 incomplete-이유:중복된 숫자가 나올 경우 해당 숫자가 배제되기 때문
		System.out.println("채점에서 하나 틀린 상태ㅡㅡ");
		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max1) {
				max1 = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max2 && numbers[i] != max1) {
				max2 = numbers[i];
			}
		}

		return max1 * max2;
	}

	public static void main(String[] args) {
		// 실행
		ProductMax test = new ProductMax();
		int[] array = { 5, 5, 3, 2, 1 };

		System.out.println(test.solution2(array));

	}
}