package algorithm.basic;

public class SieveOfEratosthenes {

	public static void makePrime(int N) {
		// 221119 에라토스테네스의 체로 소수 구하기
		// 참고: https://st-labW.tistory.com/81
		boolean[] prime = new boolean[N + 1];

		// 2 미만의 N을 입력받으면 소수는 판별할 필요가 없으므로 return
		if (N < 2) {
			return;
		}

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(N); i++) {

			// 이미 체크된 배열이면 다음 반복문으로 skip
			if (prime[i] == true) {
				continue;
			}

			// i의 배수들을 걸러주기 위한 반복문
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}

		}

		// 결과 출력
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// 29까지의 소수 구하기
		makePrime(29);

	}
}