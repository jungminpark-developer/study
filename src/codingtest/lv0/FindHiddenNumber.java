package codingtest.lv0;

public class FindHiddenNumber {

	public int solution(String my_string) {
		// �����ִ� ������ ����(1)-���α׷��ӽ� 0�ܰ�
		int answer = 0;
		char[] array = my_string.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 65) {
				System.out.println(array[i]);
				answer += Character.getNumericValue(array[i]); // array[i]���� '0' or 48�� ������
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		FindHiddenNumber test = new FindHiddenNumber();
		test.solution("aAb1B2C34oOp");
	}
}