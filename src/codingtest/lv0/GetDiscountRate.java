package codingtest.lv0;

public class GetDiscountRate {

	public int solution(int price) {
		// �� ���� ���� �ޱ�-���α׷��ӽ� 0�ܰ�
		double sale;
		double result;

		if (price >= 500000) {
			sale = 0.2;
		} else if (price >= 300000) {
			sale = 0.1;
		} else if (price >= 100000) {
			sale = 0.05;
		} else {
			sale = 0;
		}

		result = price * (1 - sale);
		result = Math.round(Math.floor(result));
		price = (int) result;
		return price;
	}
}