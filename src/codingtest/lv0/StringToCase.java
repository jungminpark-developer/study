package codingtest.lv0;

public class StringToCase {

	public String solution(String my_string) {
		// �빮�ڿ� �ҹ���-���α׷��ӽ� 0�ܰ�
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 97) {
				answer += (char) (my_string.charAt(i) - 32);
			} else {
				answer += (char) (my_string.charAt(i) + 32);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// ����
		StringToCase test = new StringToCase();
		System.out.println(test.solution("abcABC"));

	}
}
