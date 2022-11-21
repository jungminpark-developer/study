package api.string;

public class ValueOf {

	public static void main(String[] args) {
		// 문자열 -> int
		String word = "221104";

		try {
			Integer number = Integer.valueOf(word);
			int number2 = Integer.valueOf(word);
			System.out.println(number);
			System.out.println(number2);
		} catch (NumberFormatException ex) {
			System.out.println("형식변환 오류입니다.");
		}

		// int -> 문자열
		int number = 29;
		String word2 = String.valueOf(number);
		System.out.println(word2);

	}
}