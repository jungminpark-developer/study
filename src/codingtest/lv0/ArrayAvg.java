package codingtest.lv0;

public class ArrayAvg {

	public double solution(int[] numbers) {
		// �迭�� ��հ� ���ϱ�-���α׷��ӽ� 0�ܰ�
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}

		return answer / numbers.length;
	}
}