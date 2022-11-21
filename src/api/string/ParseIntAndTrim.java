package api.string;

public class ParseIntAndTrim {

	public static void main(String[] args) {
		// 221121 ParseInt 문자열을 primitive type으로 반환
		String word = " -12345 ";

		// String -> int
		// Trim을 함께 사용하여 예외처리-Trim은 문자의 앞뒤 공백을 제거
		try {
			int number = Integer.parseInt(word.trim());
			System.out.println(number);
		} catch (NumberFormatException ex) {
			System.out.println("형식변환 오류입니다.");
		}

		// int -> String
		int number = 1121;
		String word2 = Integer.toString(number);
		System.out.println(word2);

	}
}