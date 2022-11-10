package codingtest.lv0;

public class AddDigits {

	public int solution(int n) {
		// �ڸ��� ���ϱ�-���α׷��ӽ� 0�ܰ�

		// 1. ����>���ڿ�>���� ��ȯ���� Ǯ��
		int answer = 0;
		String numberString = String.valueOf(n);

		for (int i = 0; i < numberString.length(); i++) {
			answer += Character.getNumericValue(numberString.charAt(i));
		}
		return answer;

		/*
		 * 2. ���ڷ� Ǯ�� int answer2 = 0;
		 * 
		 * while(n > 0) { answer2 += n % 10; n /= 10; }
		 * 
		 * return answer2;
		 */
	}

	public static void main(String[] args) {
		// ����
		AddDigits test = new AddDigits();
		System.out.println(test.solution(1234));
	}
}