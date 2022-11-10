package codingtest.lv0;

public class GetCommondivisor {

	public int[] solution(int n) {
		// ��� ���ϱ�-���α׷��ӽ� 0�ܰ�
		int count; // �迭 ����

		if (n == 1) {
			count = 1;
		} else {
			count = 2;
		}

		// ���� ���ϱ�
		for (int i = 2, tempN = n; i < tempN; i++) {
			if (n % i == 0) {
				if ((n / i) == i) {
					count++;
				} else {
					count += 2;
				}
				tempN = n / i;
			}
		}

		// �� �ֱ�
		int[] answer = new int[count];
		for (int i = 1, j = 0; i <= n; i++) {
			if (n % i == 0) {
				answer[j] = i;
				j++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		GetCommondivisor test = new GetCommondivisor();
		int[] array = test.solution(25);

		// ��� Ȯ��
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}