package codingtest.lv0;

public class DividePizza1 {
	
	public int solution(int n) {
		// 피자 나눠 먹기 (1)-프로그래머스 0단계
		int answer = 1;

		while (7 * answer < n) {
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		DividePizza1 test = new DividePizza1();

		System.out.println("2명이 최소 한조각씩 먹기 위해서 최소 " + test.solution(2) + "판이 필요합니다.");
		System.out.println("11명이 최소 한조각씩 먹기 위해서 최소 " + test.solution(11) + "판이 필요합니다.");
		System.out.println("21명이 최소 한조각씩 먹기 위해서 최소 " + test.solution(21) + "판이 필요합니다.");
		System.out.println("22명이 최소 한조각씩 먹기 위해서 최소 " + test.solution(22) + "판이 필요합니다.");

	}
}
