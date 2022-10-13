package codingtest;

public class FindingKimSeobangInSeoul {

	public String solution(String[] seoul) {
		//서울에서 김서방 찾기-프로그래머스 1단계
        String x = "";
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		x = Integer.toString(i);
        		break;
        	}	
        }
        
        return "김서방은 "+x+"에 있다";
    }
	
	public static void main(String[] args) {
		//확인
		FindingKimSeobangInSeoul s1 = new FindingKimSeobangInSeoul();
		String[] array = { "jane", "Jung", "Kim", "park" };
		System.out.println(s1.solution(array));
	}
}
