package codingtest.lv0;

public class GetDiscountRate {

	public int solution(int price) {
		// 옷 가게 할인 받기-프로그래머스 0단계
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