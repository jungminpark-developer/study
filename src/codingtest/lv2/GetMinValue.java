package codingtest.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class GetMinValue {

	public int solution(int[] A, int[] B) {
		// 최솟값 만들기-프로그래머스 2단계
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0, j = B.length - 1; i < A.length; i++, j--) {
			answer += A[i] * B[j];
		}

		return answer;

		/*
		 * //효율성 0점 int answer = 0; ArrayList<Integer> listA = new ArrayList<>();
		 * ArrayList<Integer> listB = new ArrayList<>();
		 * 
		 * for (int temp : A) { listA.add(temp); }
		 * 
		 * for (int temp : B) { listB.add(temp); }
		 * 
		 * for (int i = 0; i < A.length; i++) { answer += Collections.min(listA) *
		 * Collections.max(listB); listA.remove(Collections.min(listA));
		 * listB.remove(Collections.max(listB)); }
		 * 
		 * return answer;
		 */
	}
}