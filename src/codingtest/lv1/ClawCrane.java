package codingtest.lv1;

import java.util.ArrayList;

class ClawCrane {
	public int solution(int[][] board, int[] moves) {
		// 크레인 인형뽑기 게임-프로그래머스 0단계
		ArrayList<Integer> stack = new ArrayList<>();
		int count = 0; // 사라진 인형 카운트

		for (int i = 0; i < moves.length; i++) {
			// line번 위치에서 인형이 있을 경우 스택에 추가하고 내부 for문은 탈출
			for (int j = 0, line = moves[i] - 1; j < board.length; j++) {
				if (board[j][line] > 0) {
					stack.add(board[j][line]);
					board[j][line] = 0; // 인형을 뽑았으니 0으로 초기화
					break;
				}
			}

			// stack에 두 개 이상 쌓였을 때부터 같은 인형이 연속으로 쌓였는지 확인 후 제거
			if (stack.size() >= 2) {
				for (int k = 1; k < stack.size(); k++) {
					if (stack.get(k) == stack.get(k - 1)) {
						stack.remove(k);
						stack.remove(k - 1);
						count += 2;
					}
				}
			}

		} // 인형 뽑기 종료
		return count;
	}

	public static void main(String[] args) {
		// 실행
		ClawCrane test = new ClawCrane();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		test.solution(board, moves);
	}
}