package codingtest.lv1;

public class ConditionalCalcul {

	public long solution(int price, int money, int count) {
		// ������ �ݾ� ����ϱ�-���α׷��ӽ� 1�ܰ�
		long answer = 0;

		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}

		if (answer <= money) {
			return 0;
		} else {
			return answer - money;
		}

	}

	public static void main(String[] args) {
		// ����
		ConditionalCalcul test = new ConditionalCalcul();
		System.out.println(test.solution(3, 20, 4));
	}
}