package codingtest.lv1;

public class RepeatLetters {

	public String solution(int n) {
		//수박수박수박수박수박수?-프로그래머스 1단계
		String answer = "";
		int repeat = n/2;
		
		for(int i=0; i<repeat; i++) {
			answer += "수박";
		}
		
		if(n % 2 != 0) {
			answer += "수";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//실행
		RepeatLetters test = new RepeatLetters();
		System.out.print(test.solution(3));
		
	}
}