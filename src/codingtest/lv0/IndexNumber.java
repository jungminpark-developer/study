package codingtest.lv0;

public class IndexNumber {

	public int solution(int num, int k) {
		// ���� ã��-���α׷��ӽ� 0�ܰ�
		String number = String.valueOf(num);
		String searchNumber = String.valueOf(k);

		if (number.indexOf(searchNumber) == -1) {
			return -1;
		} else {
			return number.indexOf(searchNumber) + 1;
		}

	}

	public static void main(String[] args) {
		// ����
		IndexNumber test = new IndexNumber();
		System.out.println(test.solution(29183, 1));
	}

}
