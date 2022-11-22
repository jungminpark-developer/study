package codingtest.lv0;

public class GetCommondivisor {

	public int[] solution(int n) {
		// 약수 구하기-프로그래머스 0단계
		int count; // 배열 길이

		if (n == 1) {
			count = 1;
		} else {
			count = 2;
		}

		// 길이 구하기
		for (int i = 2, tempN = n; i < tempN; i++) {
			if (n % i == 0) {
				if ((n / i) == i) {
					count++;
				} else {
					count += 2;
				}
				tempN = n / i;
			}
		}

		// 값 넣기
		int[] answer = new int[count];
		for (int i = 1, j = 0; i <= n; i++) {
			if (n % i == 0) {
				answer[j] = i;
				j++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		GetCommondivisor test = new GetCommondivisor();
		int[] array = test.solution(25);

		// 출력 확인
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}