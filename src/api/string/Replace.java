package api.string;

public class Replace {

	public static void main(String[] args) {
		// 221121 문자열 치환
		String word = "웹 프 로 그 래 밍";

		// 특정 문자로 치환
		String result1 = word.replace("웹", "Web");
		System.out.println("1. 글자 대체: " + result1);

		// 공백 제거
		String result2 = word.replace(" ", "");
		System.out.println("2. 공백 제거: " + result2);

	}
}