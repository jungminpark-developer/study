package codingtest.lv1;

public class CoverString {

	public String solution(String phone_number) {
		// �ڵ��� ��ȣ ������-���α׷��ӽ� 1�ܰ�
		String answer = "";
		String asterisk = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
			asterisk += "*";
		}

		answer = phone_number.replace(phone_number.substring(0, phone_number.length() - 4), asterisk);

		return answer;

		/*
		 * //�ٸ� ����� Ǯ�� ���� �߰� ���� String answer = "";
		 * 
		 * for(int i=0; i < phone_number.length()-4; i++) { answer += "*"; }
		 * 
		 * answer += phone_number.substring(phone_number.length()-4);
		 * 
		 * return answer;
		 */
	}

	public static void main(String[] args) {
		// ����
		CoverString test = new CoverString();
		System.out.print(test.solution("027778888"));

	}
}