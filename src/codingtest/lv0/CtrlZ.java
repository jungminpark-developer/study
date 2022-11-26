package codingtest.lv0;

import java.util.ArrayList;

public class CtrlZ {
	public int solution(String s) {
		// 컨틀롤 제트-프로그래머스 0단계
		int answer = 0;
		// 공백 기준으로 분할 후 배열에 저장
		String[] array = s.split(" ");

		// 더한 숫자를 저장해놓을 ArrayList-스택 대용
		ArrayList<Integer> addedList = new ArrayList<>();
		addedList.add(0); // 0번 인덱스에 0을 저장하고 시작
		int index = 0; // 리스트의 인덱스로 사용할 변수

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("Z")) {
				answer -= addedList.get(index);

				// 인덱스가 0이라면 인덱스를 감소하지 않고 놔두기
				if (index == 0) {
					continue;
				} else {
					addedList.remove(index);
					index--;
				}

			} else {
				answer += Integer.parseInt(array[i]);
				addedList.add(Integer.parseInt(array[i]));
				index++;
			}
		}

		return answer;
	}

	public static void main(String args[]) {
		// 실행
		CtrlZ test = new CtrlZ();
		System.out.println(test.solution("1 1 1 1 Z Z 1 1 Z Z Z Z Z Z 1"));
		System.out.println(test.solution("10 Z 20 Z 1"));
	}
}