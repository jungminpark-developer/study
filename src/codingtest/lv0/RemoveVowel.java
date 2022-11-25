package codingtest.lv0;

public class RemoveVowel {

	public String solution(String my_string) {
		// 모음 제거-프로그래머스 0단계
		String answer = "";
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < vowel.length; j++) {
				// 모음 분류와 같다면 아무 행동도 하지 않고 break
				if (my_string.charAt(i) == vowel[j]) {
					break;
				}
				// 마지막까지 모음을 발견하지 못했다면 기존 문자를 answer에 저장
				if (j == 4) {
					answer += my_string.charAt(i);
				}

			}
		}

		return answer;
	}
}