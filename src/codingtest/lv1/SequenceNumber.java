package codingtest.lv1;

public class SequenceNumber {

	public long[] solution(int x, int n) {
		//x만큼 간격이 있는 n개의 숫자-프로그래머스 1단계
		//0은 자연수가 아님, 정수는 0을 포함한 모든 자연수
		long[] answer = new long[n];

		for(int i=0; i<answer.length; i++) {
			answer[i] = x * (i + 1L);
			//1일땐 85점으로 불합격. x와 n의 숫자가 커지게 되면 int의 범위를 벗어나기 때문
			//프로그래머스 hyungseon88님의 답변
		}

		return answer;
	}

	public static void main(String[] args) {
		//실행
		SequenceNumber test = new SequenceNumber();
		long[] array = test.solution(10000000, 1000);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}
}