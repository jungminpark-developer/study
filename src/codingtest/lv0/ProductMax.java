package codingtest.lv0;

public class ProductMax {

	public int solution(int[] numbers) {
		//�ִ� �����(1)-���α׷��ӽ� 0�ܰ�-incomplete
		System.out.println("ä������ �ϳ� Ʋ�� ���¤Ѥ�");
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
		//����
		ProductMax test = new ProductMax();
		int[] array = {5,4,3,2,1};
		
		System.out.println(test.solution(array));
	}

}
