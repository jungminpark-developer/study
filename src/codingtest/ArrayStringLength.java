package codingtest;

public class ArrayStringLength {
	
	public int[] solution(String[] strlist) {
		
		int[] answer = {};

		for(int i=0; i<strlist.length; i++){
			answer[i] = strlist[i].length();
		}
		
		for(int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}

		return answer;
	}
	

	
	public static void main(String[] args) {
		//½ÇÇà
		ArrayStringLength test = new ArrayStringLength();
		String[] strlist = {"We", "are", "the", "world!"};
		
		System.out.println(strlist[3].length());
		System.out.println(test.solution(strlist));
		
	}

}
