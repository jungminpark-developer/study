package codingtest.lv1;

public class GetMiddleCharacter {

	public String solution(String s) {
		// ��� ���� ��������-���α׷��ӽ� 1�ܰ�
		String answer = "";

		if (s.length() % 2 == 1) { // ���ڼ��� Ȧ�����
			answer += s.charAt(s.length() / 2);
		} else {
			answer += s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		GetMiddleCharacter test = new GetMiddleCharacter();
		System.out.println(test.solution("abcd"));
	}
}