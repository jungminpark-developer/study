package codingtest.lv0;

public class FindHiddenNumber {

	public int solution(String my_string) {
		//숨어있는 숫자의 덧셈(1)-프로그래머스 0단계
		int answer = 0;
		char[] array = my_string.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<65) {
				System.out.println(array[i]);
				answer += Character.getNumericValue(array[i]); //array[i]에서 '0' or 48을 빼도됨 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//실행
		FindHiddenNumber test = new FindHiddenNumber();
		test.solution("aAb1B2C34oOp");
	}
}