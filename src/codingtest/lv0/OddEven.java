package codingtest.lv0;

public class OddEven {

	public int[] solution(int[] num_list) {
		//짝수 홀수 개수-프로그래머스 0단계
		int[] answer = new int[2];
		int countEven = 0;
		
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				countEven++;
			}
		}
		
		answer[0] = countEven;
		answer[1] = num_list.length - countEven;
		
		return answer;
	}
}