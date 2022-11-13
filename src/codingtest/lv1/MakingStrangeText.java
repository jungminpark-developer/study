package codingtest.lv1;

public class MakingStrangeText {

	public String solution(String s) {
		// �̻��� ���� �����-���α׷��ӽ� 1�ܰ�-�ſ� �����ϰ� Ǯ����.
		String answer = "";
		boolean even = true;

		for (int i = 0; i < s.length(); i++) {
			// i��° �ε����� ���ڰ� ������ ���
			if (s.charAt(i) == 32) {
				even = true;
				answer += s.charAt(i);
				continue;
			}

			if (even) {
				// ¦�� �ε����� ���ڰ� �ҹ��ڰ� �ƴ� ���(�빮���� ���)
				if (s.charAt(i) < 97) {
					answer += s.charAt(i);
				} else {
					answer += (char) (s.charAt(i) - 32);
				}
			} else {
				// Ȧ�� �ε����� ���ڰ� �ҹ��ڰ� �ƴ� ���(�빮���� ���)
				if (s.charAt(i) < 97) {
					answer += (char) (s.charAt(i) + 32);
				} else {
					answer += s.charAt(i);
				}
			}

			even = !even;
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		MakingStrangeText test = new MakingStrangeText();
		System.out.println(test.solution("  tRy hello  WORLD    "));
	}
}