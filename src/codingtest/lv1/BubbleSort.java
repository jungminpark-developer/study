package codingtest.lv1;

public class BubbleSort {
	public String solution(String s) {
		// ���ڿ� ������������ ��ġ�ϱ�-���α׷��ӽ� 1�ܰ�
		String answer = "";
		char[] array = s.toCharArray();
		char temp = ' '; // �����͸� ��ȯ�ϱ� ���� �ӽ� �����

		// ���� ���� ���
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			answer += array[i];
		}

		return answer;
	}
}