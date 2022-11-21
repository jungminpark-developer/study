package api.string;

public class CharAt {

	public static void main(String[] args) {
		// 221121 리턴 타입은 char

		String word = "pjm";
		char a = word.charAt(0);
		System.out.println("1. 인덱스의 시작은 0: " + a);

		String subject = "자바 프로그래밍";
		System.out.println("2. 공백 또한 index에 포함: " + subject.charAt(3));

		// char -> int
		String number = "1";
		System.out.println("3. ASCII코드로 '0'은 48, '1'은 49");

		int number1 = (number.charAt(0) - 0);
		int number2 = (number.charAt(0) - '0');
		int number3 = (number.charAt(0) - 48);

		System.out.println(" 1) 1-0 = " + number1);
		System.out.println(" 2) 1-'0' = " + number2);
		System.out.println(" 3) 1-48 = " + number3);

		/*
		 * 오류-index out of range: 3, 인덱스가 범위를 벗어남 char d = word.charAt(3);
		 * System.out.println(d);
		 */

	}
}