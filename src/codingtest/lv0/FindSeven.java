package codingtest.lv0;

public class FindSeven {

	public int solution(int[] array) {
		// 7의 개수-프로그래머스 0단계
		int answer = 0;

		for(int i = 0; i < array.length; i++) {
			int divisorNumber = 10; // 나누는 수, 제수
			int remainder = 7; // 나머지

			while(array[i] * 10 >= divisorNumber) {
				if(array[i] % divisorNumber == remainder) {
					answer++;
				}
				array[i] -= array[i] % divisorNumber;
				divisorNumber *= 10;
				remainder *= 10;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		FindSeven test = new FindSeven();
		int[] array2 = { 700, 707, 17 };
		System.out.println(test.solution(array2));
	}
}