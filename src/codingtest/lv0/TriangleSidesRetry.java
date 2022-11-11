package codingtest.lv0;

import java.util.Arrays;

public class TriangleSidesRetry {

	public int solution(int[] sides) {
		// �ﰢ���� �ϼ� ����(���� API ���)-���α׷��ӽ� 0�ܰ�
		Arrays.sort(sides);

		if (sides[2] < sides[0] + sides[1]) {
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		// ����
		TriangleSidesRetry test = new TriangleSidesRetry();
		int[] tryAngle = { 7, 3, 3 };
		System.out.println(test.solution(tryAngle));
	}
}