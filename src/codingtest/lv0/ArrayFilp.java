package codingtest.lv0;

public class ArrayFilp {
	
	public int[] solution(int[] num_list) {
		//배�?? ?��?�?-??�?그�??머�?? 0?��?
		//�? ????
		int[] answer = new int[num_list.length];
		int j = 0;

		for(int i=num_list.length-1; i>=0; i--){
			answer[j] = num_list[i];
			j++;
		}

		return answer;
		
		/*???? ???? ?��?��?�?
		int[] answer = new int[num_list.length];
		
		for(int i=0; i<num_list.length; i++) {
			answer[i] = num_list[num_list.length-i-1];
		}
		return answer;
		*/
	}
}