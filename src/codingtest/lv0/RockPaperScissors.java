package codingtest.lv0;

public class RockPaperScissors {

	public String solution(String rsp) {
		//����������-���α׷��ӽ� 0�ܰ� �����ϴ���
		System.out.println("�ϴ���");
		
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
		//����

	}

}
