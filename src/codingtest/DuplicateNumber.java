package codingtest;

public class DuplicateNumber {

	public int solution(int[] array, int n) {
		//중복된 숫자 개수 구하기-프로그래머스 0단계
		int answer = 0;

		for(int i=0; i<array.length; i++){
			if(array[i] == n) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		//실행
		DuplicateNumber test = new DuplicateNumber();
		int[] array = { 1, 3, 5, 3 , 7, 2, 11 };
		System.out.println("배열 내 3의 개수: "+test.solution(array, 3));

	}
}
