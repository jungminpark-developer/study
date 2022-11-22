package codingtest.lv1;

public class LottoRanking {

	public int[] solution(int[] lottos, int[] win_nums) {
		// 로또의 최고 순위와 최저 순위-프로그래머스 1단계
		int rank = 7; // 7개부터 일치하는 개수가 나올때마다 1순위씩 상승
		int lucky = 0; // 0일 경우 최고 순위에 합산할 개수

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

		// 맞춘 숫자가 없을 경우 순위 조정
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