package codingtest.lv1;

public class LottoRanking {

	public int[] solution(int[] lottos, int[] win_nums) {
		// �ζ��� �ְ� ������ ���� ����-���α׷��ӽ� 1�ܰ�
		int rank = 7; // 7������ ��ġ�ϴ� ������ ���ö����� 1������ ���
		int lucky = 0; // 0�� ��� �ְ� ������ �ջ��� ����

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				lucky++;
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					rank--;
					continue;
				}
			}
		}

		// ���� ���ڰ� ���� ��� ���� ����
		if (rank == 7 && lucky == 0) {
			rank--;
		} else if (rank == 7) {
			rank--;
			lucky--;
		}

		int[] answer = { rank - lucky, rank };

		return answer;
	}
}
