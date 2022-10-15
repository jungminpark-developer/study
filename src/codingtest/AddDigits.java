package codingtest;

public class AddDigits {

	public int solution(int n) {
		//자릿수 더하기-프로그래머스 0단계
		
		//1. 숫자>문자열>숫자 변환으로 풀이
		int answer = 0;
		String numberString = String.valueOf(n);
		
		for(int i=0; i<numberString.length(); i++) {
			answer += Character.getNumericValue(numberString.charAt(i));
		}
		return answer;
		
		/*2. 숫자로 풀이
		int answer2 = 0;
		
		while(n > 0) {
			answer2 += n % 10;
			n /= 10;
		}
		
		return answer2;
		*/
	}
	
	public static void main(String[] args) {
		//실행
		AddDigits test = new AddDigits();
		System.out.println(test.solution(1234));
	}
}