package codingtest.lv1;

public class RemoveContinuedNumbers1 {

	public int[] solution(int[] arr) {
		// ���� ���ڴ� �Ⱦ�-���α׷��ӽ� 1�ܰ�
		/*
		 * ù ��° �õ�-ȿ���� 0�� ���� ����: String���� int�� ��ȯ�ϴ� �� ��򰡿���?
		 */

		// �迭�� ù ��° ������ �ʱ�ȭ
		int tempNumber = arr[0]; // �ֱ� �����͸� �����Ͽ� ��
		String result = "" + arr[0]; // ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� �� ���ڵ��� ������ ����

		for (int i = 1; i < arr.length; i++) {
			if (tempNumber == arr[i]) {
				continue;
			} else {
				tempNumber = arr[i];
				result += tempNumber;
			}
		}

		// �迭 ����
		String[] temp = result.split(""); // �� ���ھ� �и�
		int[] answer = new int[result.length()];

		// int�� ��ȯ�Ͽ� ���� ����
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(temp[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		RemoveContinuedNumbers1 test = new RemoveContinuedNumbers1();
		int[] Array = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(test.solution(Array));

	}
}