package codingtest.lv0;

import java.util.Arrays;

public class ComparisonString {

	public int solution(String before, String after) {
		//A로 B 만들기-프로그래머스 0단계
		char[] beforeArray = before.toCharArray();
		Arrays.sort(beforeArray);
		char[] afterArray = after.toCharArray();
		Arrays.sort(afterArray);
		
		for(int i=0; i<before.length(); i++) {
			if(beforeArray[i] != afterArray[i]) {
				return 0;
			}
		}
		
		return 1;
	}
	public static void main(String[] args) {
		//실행
		ComparisonString test = new ComparisonString();
		System.out.print(test.solution("olleh", "hello"));

	}
}