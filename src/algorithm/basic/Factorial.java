package algorithm.basic;

public class Factorial {

	public int factorial(int num) {
		// 221216 팩토리얼-참고: factorial.txt
		if (num == 1) {
			return 1;
		}

		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		// 실행
		Factorial test = new Factorial();
		int n = 10;
		System.out.println("1부터 " + n + "까지의 곱: " + test.factorial(n));
	}
}