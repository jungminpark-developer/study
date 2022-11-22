package codingtest.lv1;

public class RemoveContinuedNumbers1 {

	public int[] solution(int[] arr) {
		// 같은 숫자는 싫어-프로그래머스 1단계
		/*
		 * 첫 번째 시도-효율성 0점 이유 추측: String에서 int로 변환하는 그 어딘가에서?
		 */

		// 배열의 첫 번째 값으로 초기화
		int tempNumber = arr[0]; // 최근 데이터를 저장하여 비교
		String result = "" + arr[0]; // 연속적으로 나타나는 숫자는 하나만 남기고 그 숫자들을 저장할 공간

		for (int i = 1; i < arr.length; i++) {
			if (tempNumber == arr[i]) {
				continue;
			} else {
				tempNumber = arr[i];
				result += tempNumber;
			}
		}

		// 배열 선언
		String[] temp = result.split(""); // 한 글자씩 분리
		int[] answer = new int[result.length()];

		// int로 변환하여 최종 저장
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(temp[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		RemoveContinuedNumbers1 test = new RemoveContinuedNumbers1();
		int[] Array = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(test.solution(Array));

	}
}