package codingtest.lv0;

public class ProductMax {

	public int solution(int[] numbers) {
		//최댓값 만들기(1)-프로그래머스 0단계-incomplete
		System.out.println("채점에서 하나 틀린 상태ㅡㅡ");
		int max1 = 0;
		int max2 = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] >= max1) {
				max1 = numbers[i];
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == max1)
				continue;
			
			if(numbers[i] >= max2) {
				max2 = numbers[i];
			}
		}
		
		return max1 * max2;
	}
	
	public static void main(String[] args) {
		//실행
		ProductMax test = new ProductMax();
		int[] array = {5,4,3,2,1};
		
		System.out.println(test.solution(array));
	}

}
