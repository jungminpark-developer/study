package codingtest.lv0;

public class ArrayMaxValueAndIndex {

	public int[] solution(int[] array) {
		//가장 큰 수 찾기-프로그래머스 0단계
		int[] answer = new int[2];

		for(int i=0; i<array.length; i++) { //int의 default값은 0
			if(array[i] >= answer[0]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}

		return answer;

		/*첫 풀이 코드
		int[] answer = new int[2];
		int max=0;
		int index=0;

		for(int i=0; i<array.length; i++) {
			if(array[i] >= max) {
				max = array[i];
				index = i;
			}
		}

		answer[0] = max;
		answer[1] = index;
		return answer;
		*/
	}
}