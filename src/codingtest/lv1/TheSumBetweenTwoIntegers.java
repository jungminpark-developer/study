package codingtest.lv1;

public class TheSumBetweenTwoIntegers {

	public long solution(int a, int b) {
		// �� ���� ������ ��-���α׷��ӽ� 1�ܰ�
		long answer = 0;

		if (a == b) {
			return a;
		}

		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		TheSumBetweenTwoIntegers test = new TheSumBetweenTwoIntegers();
		System.out.println(test.solution(5, 3));
	}
}