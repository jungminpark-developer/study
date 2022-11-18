package codingtest.lv1;

public class GetCommonDivisor2 {

	public int solution(int left, int right) {
		// 약수의 개수와 덧셈-프로그래머스 1단계
		// 풀이를 보고 배운 점: 제곱수의 약수의 개수는 항상 홀수, 아닌 수는 짝수
		int answer = 0;

		if (left == 1) {
			answer--;
			left++;
		}

		for (int i = left; i <= right; i++) {
			int even = 0; // 약수의 개수가 짝수일 경우 0

			for (int j = 2; j <= i / 2; j++) {
				for (int k = 2; k <= i / 2; k++) {
					if (j * k == i) {
						even++;
						break;
					}
				} // 내부 for문 종료
			} // for문 종료

			if (even % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
		// 1번 케이스 시간초과
//	int answer = 0;
//    
//    for (int i = left; i <= right; i++) {
//        boolean even = true; // 약수의 개수가 짝수일 경우 true    
//        
//        for (int j = 2; j <= i / 2; j++) {
//            for (int k = 2; k <= i / 2; k++) {
//                if (j * k == i) {
//                    even = !even;
//                    break;
//                }
//            } // 내부 for문 종료
//        } // for문 종료
//    
//        if (even) {
//            answer += i;
//        } else {
//            answer -= i;
//        }
//    }
//
//		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
