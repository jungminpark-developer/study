package codingtest.lv0;

public class IndexOfTest {

	public int solution(String str1, String str2) {
		// ���ڿ��ȿ� ���ڿ�-���α׷��ӽ� 0�ܰ�
		// ������
		if (str1.indexOf(str2) != -1) {
			return 1;
		} else {
			return 2;
		}

		/*
		 * ��� ���� contains �߰�, ���� �� �õ� if(str1.contains(str2)) { return 1; }else { return
		 * 2; }
		 */
	}

	public static void main(String[] args) {
		// ����
		IndexOfTest test = new IndexOfTest();
		System.out.println(test.solution("ab6CDE443fgh", "6CD"));
		System.out.println(test.solution("ppprrrrogrammers", "pppp"));
	}
}