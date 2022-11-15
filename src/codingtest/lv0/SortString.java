package codingtest.lv0;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	public int[] solution(String my_string) {
		// 문자열 정렬하기(1)-프로그래머스 0단계
		ArrayList<Integer> intArray = new ArrayList<>();

		char[] charArray = my_string.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] < 65) {
				intArray.add(charArray[i] - '0');
			}
		}

		Collections.sort(intArray);

		int[] answer = new int[intArray.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = intArray.get(i).intValue();
		}

		return answer;
	}
}