package codingtest.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMissingNumber {

	public int solution(int[] numbers) {
		// ���� ���� ���ϱ�-���α׷��ӽ� 1�ܰ�
		int total = 0;
		ArrayList<Integer> numberGroup = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numberGroup.size(); j++) {
				if (numbers[i] == numberGroup.get(j)) {
					numberGroup.remove(j);
				}
			}
		}

		for (int i = 0; i < numberGroup.size(); i++) {
			total += numberGroup.get(i);
		}

		return total;
	}

	public static void main(String[] args) {
		// ����
		AddMissingNumber test = new AddMissingNumber();
		int[] array = { 5, 8, 4, 0, 6, 7, 9 };
		System.out.print(test.solution(array));
	}
}