package codingtest.lv1;

public class RepeatLetters {

	public String solution(int n) {
		// ���ڼ��ڼ��ڼ��ڼ��ڼ�?-���α׷��ӽ� 1�ܰ�
		String answer = "";
		int repeat = n / 2;

		for (int i = 0; i < repeat; i++) {
			answer += "����";
		}

		if (n % 2 != 0) {
			answer += "��";
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		RepeatLetters test = new RepeatLetters();
		System.out.print(test.solution(3));

	}
}