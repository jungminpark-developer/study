package codingtest.lv1;

public class StringHandlingBasic {

	public boolean solution(String s) {
		// ���ڿ� �ٷ�� �⺻-���α׷��ӽ� 1�ܰ�
		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 65) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// ����
		StringHandlingBasic test = new StringHandlingBasic();
		System.out.print(test.solution("1234"));
	}
}