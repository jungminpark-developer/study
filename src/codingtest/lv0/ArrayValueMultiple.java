package codingtest.lv0;

public class ArrayValueMultiple {

	public int[] solution(int[] numbers) {
		// �迭 �� �� �����-���α׷��ӽ� 0�ܰ�
		int[] answer = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}

		return answer;
	}
}