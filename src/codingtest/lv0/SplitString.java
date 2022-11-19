package codingtest.lv0;

public class SplitString {

	public String[] solution(String my_str, int n) {
		// 잘라서 배열로 저장하기-프로그래머스 0단계
		double length = (double) my_str.length() / n;
		String[] answer = new String[(int) Math.ceil(length)];

		// index 변수는 substring에 사용
		for (int i = 0, index = 0; i < answer.length; i++, index += n) {
			if (index + n > my_str.length()) {
				answer[i] = my_str.substring(index, my_str.length());
			} else {
				answer[i] = my_str.substring(index, index + n);
			}
		}

		return answer;
	}
}
