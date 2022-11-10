package codingtest.lv0;

public class ArrayFilp {

	public int[] solution(int[] num_list) {
		// 배열 뒤집기-프로그래머스 0단계
		// 첫 풀이
		int[] answer = new int[num_list.length];
		int j = 0;

		for (int i = num_list.length - 1; i >= 0; i--) {
			answer[j] = num_list[i];
			j++;
		}

		return answer;

		/*
		 * 다른 사람의 풀이보고 추가 공부 int[] answer = new int[num_list.length];
		 * 
		 * for(int i=0; i<num_list.length; i++) {answer[i] =
		 * num_list[num_list.length-i-1]; } return answer;
		 */
	}
}