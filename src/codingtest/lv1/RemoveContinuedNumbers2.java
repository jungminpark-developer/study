package codingtest.lv1;

import java.util.ArrayList;

public class RemoveContinuedNumbers2 {

	public int[] solution(int[] arr) {
		// ���� ���ڴ� �Ⱦ�-���α׷��ӽ� 1�ܰ�
		/*
		 * �� ��° �õ�-���� ���ľ��� ��: ������ �����͸� �˻��� �� ���� ������ ���� ��, �ε����� Ȱ���� �� �־���.
		 */

		ArrayList<Integer> answer = new ArrayList<>();

		int tempNumber = arr[0]; // �ֱ� �����͸� �����Ͽ� ��
		answer.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == tempNumber) {
				continue;
			} else {
				tempNumber = arr[i];
				answer.add(tempNumber);
			}
		}

		int[] answer2 = new int[answer.size()];
		for (int i = 0; i < answer2.length; i++) {
			answer2[i] = answer.get(i);
		}

		return answer2;
	}
}