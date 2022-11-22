package codingtest.lv1;

public class GetSpecificCharacter {

	boolean solution(String s) {
		// 문자열 내 p와 y의 개수 확인하기-프로그래머스 1단계
		// 다른 사람의 풀이를 보고 공부한 답안
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

	boolean solution2(String s) {
		// 첫 제출 답안
		int countP = 0;
		int countY = 0;
		String[] array;

		array = s.split(""); // 문자열 ""기호로 끊기

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("p") || array[i].equals("P")) {
				countP++;
			}
			if (array[i].equals("y") || array[i].equals("Y")) {
				countY++;
			}
		}

		if (countP == countY) {
			return true;
		} else {
			return false;
		}

	}
}