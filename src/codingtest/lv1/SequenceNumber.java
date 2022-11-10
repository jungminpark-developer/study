package codingtest.lv1;

public class SequenceNumber {

	public long[] solution(int x, int n) {
		// x��ŭ ������ �ִ� n���� ����-���α׷��ӽ� 1�ܰ�
		// 0�� �ڿ����� �ƴ�, ������ 0�� ������ ��� �ڿ���
		long[] answer = new long[n];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = x * (i + 1L);
			// 1�϶� 85������ ���հ�. x�� n�� ���ڰ� Ŀ���� �Ǹ� int�� ������ ����� ����
			// ���α׷��ӽ� hyungseon88���� �亯
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		SequenceNumber test = new SequenceNumber();
		long[] array = test.solution(10000000, 1000);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}