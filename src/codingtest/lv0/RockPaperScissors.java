package codingtest.lv0;

public class RockPaperScissors {

	public String solution(String rsp) {
		//가위바위보-프로그래머스 0단계 아직하는중
		System.out.println("하는중");
		
		String answer = "";
		
		for(int i=0; i<rsp.length(); i++) {
			switch(rsp.charAt(i)) {
				case '2':
					answer += "0"; 
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//실행

	}

}
