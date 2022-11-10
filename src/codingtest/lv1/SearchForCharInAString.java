package codingtest.lv1;

public class SearchForCharInAString {

	boolean solution(String s) {
		// 문자열 내에서 p와 y의 개수 찾기-프로그래머스 1단계
		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				count++;
			} else if (s.charAt(i) == 'y') {
				count--;
			}
		}

		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 실행-p와 y의 개수가 같다면 true
		SearchForCharInAString test = new SearchForCharInAString();
		System.out.println(test.solution("pPolYyYmorphism")); // p와 y개 3개씩
	}
}