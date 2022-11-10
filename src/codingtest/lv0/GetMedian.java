package codingtest.lv0;

import java.util.Arrays;

public class GetMedian {
	
	public int solution(int[] array) {
		// 중앙값 구하기-프로그래머스 0단계
		int answer = 0;
		Arrays.sort(array);  
		answer = array.length / 2;  
		answer = array[answer];
		return answer;
	}
}