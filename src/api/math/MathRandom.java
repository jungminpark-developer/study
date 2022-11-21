package api.math;

public class MathRandom {

	public static void main(String[] args) {
		// 난수(랜덤 숫자) 생성

		// 원하는 범위의 숫자 뽑기
		for (int i = 0; i < 10; i++) {
			int number = (int) (Math.random() * 100) + 1;
			System.out.print(number + " ");
		}
	}

}