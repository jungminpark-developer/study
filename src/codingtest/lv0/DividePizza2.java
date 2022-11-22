package codingtest.lv0;

public class DividePizza2 {
	
	public int solution(int n) {
		// 피자 나눠 먹기(2)-프로그래머스 0단계
		int answer = 1; // 1판부터 시작

		while ((answer * 6) % n != 0) {
			answer++;
		}

		return answer;
	}

}