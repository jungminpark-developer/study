package codingtest.lv0;

public class ArrayStringLength {

	public int[] solution(String[] strlist) {
		// �迭 ������ ����-���α׷��ӽ� 0�ܰ�
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		/*
		 * ��� Ȯ�� �뵵 for(int i=0; i<answer.length; i++){ System.out.println(answer[i]); }
		 */

		return answer;
	}

	public static void main(String[] args) {
		// ����
		ArrayStringLength test = new ArrayStringLength();
		String[] strlist = { "We", "are", "the", "world!", "����" };

		test.solution(strlist);

	}
}