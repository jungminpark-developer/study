package codingtest.lv0;

public class StringRepeat {

	public String solution(String my_string, int n) {
		// 문자 반복 출력하기-프로그래머스 0단계
		// 1. split
		String[] array = my_string.split("");
		String answer = "";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < n; j++) {
				answer += array[i];
			}
		}

		/*
		 * 2. 다른 사람의 풀이 보고 charAt으로 풀이 for(int i=0; i<my_string.length(); i++) { for(int
		 * j=0; j<n; j++) { answer += my_string.charAt(i); } }
		 */

		return answer;
	}

	public static void main(String[] args) {
		// 실행
		StringRepeat test = new StringRepeat();
		System.out.println(test.solution("Jpark", 2));

		// 실험실
		System.out.println("---------------------");
		String test2 = "k";
		System.out.println(test2.replace(test2, test2 + test2 + test2));
	}
}