package codingtest.lv0;

public class DividePizza2 {
	public int solution(int n) {
		// ���� ���� �Ա�(2)-���α׷��ӽ� 0�ܰ�
		int answer = 1; // 1�Ǻ��� ����

		while ((answer * 6) % n != 0) {
			answer++;
		}

		return answer;
	}

}
