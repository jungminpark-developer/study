package codingtest.lv0;

public class TriangleSides {

	public int solution(int[] sides) {
		// �ﰢ���� �ϼ� ����-���α׷��ӽ� 0�ܰ�
		int max = 0;
		int Side = 0;

		// ���� ū �� ����
		for (int i = 0; i < sides.length; i++) {
			if (sides[i] >= max) {
				max = sides[i];
			}
			Side += sides[i]; // �� ���� �� ����
		}

		// ��� ����
		if (max < Side - max) { // ���� ū �� < �� ���� ��-���� ū ��=�� ���� ��
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		// ����
		TriangleSides test = new TriangleSides();
		int[] tryAngle = { 3, 3, 3 };

		System.out.println(test.solution(tryAngle));
	}
}