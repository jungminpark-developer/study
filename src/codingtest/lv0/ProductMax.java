package codingtest.lv0;

public class ProductMax {

	public int solution2(int[] numbers) {
		// �ִ� �����(1)-���α׷��ӽ� 0�ܰ�-���� for�� ����
		int max = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] * numbers[j] >= max) {
					max = numbers[i] * numbers[j];
				}
			}
		}

		return max;
	}

	public int solution(int[] numbers) {
		// ù �õ� incomplete-����:�ߺ��� ���ڰ� ���� ��� �ش� ���ڰ� �����Ǳ� ����
		System.out.println("ä������ �ϳ� Ʋ�� ���¤Ѥ�");
		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max1) {
				max1 = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max2 && numbers[i] != max1) {
				max2 = numbers[i];
			}
		}

		return max1 * max2;
	}

	public static void main(String[] args) {
		// ����
		ProductMax test = new ProductMax();
		int[] array = { 5, 5, 3, 2, 1 };

		System.out.println(test.solution2(array));

	}
}