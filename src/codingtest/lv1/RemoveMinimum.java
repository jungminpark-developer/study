package codingtest.lv1;

public class RemoveMinimum {

	public int[] solution(int[] arr) {
		// 제일 작은 수 제거하기-프로그래머스 1단계

		int[] answer;
		int temp = 0;
		int min = arr[0];
		int i;

		// 입력받은 배열의 길이가 1이라면 -1 입력 후 종료
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;

			// 아니라면 제일 작은 수 제거하고 종료
		} else {

			// 배열 탐색 후 최소값 구하기
			for (i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					temp = i;
				}
			}

			answer = new int[arr.length - 1];

			// 최소값 자리부터 땡기기
			for (i = temp; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}

			// 배열 옮겨담기
			for (i = 0; i < answer.length; i++) {
				answer[i] = arr[i];
				System.out.println(answer[i]);
			}

		} // else문 종료
		return answer;
	}
}