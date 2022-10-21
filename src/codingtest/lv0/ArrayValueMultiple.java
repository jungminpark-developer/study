package codingtest.lv0;

public class ArrayValueMultiple {

	public int[] solution(int[] numbers) {
		//배열 두 배 만들기-프로그래머스 0단계
		int[] answer = new int[numbers.length];

		for(int i=0; i<numbers.length; i++){
			answer[i] = numbers[i] * 2;
		}

		return answer;
	}
}