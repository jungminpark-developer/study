package codingtest.lv0;

public class StringFlip {
	
	public String solution(String my_string) {
		//문자열 뒤집기-프로그래머스 0단계
		String answer = "";

		for(int i=my_string.length()-1; i>=0; i--){
			answer += String.valueOf(my_string.charAt(i));
		}
   
		return answer;
	}
	
	public static void main(String[] args) {
		//실행
		StringFlip test = new StringFlip();
		System.out.println(test.solution("abcde"));
		
		String a = "abcde";
		System.out.println(a.length());
		
		String b = String.valueOf(a.charAt(4));
		System.out.println(b);
		
	}
}