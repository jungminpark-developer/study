package api.string;

public class ToCharArray {

	public static void main(String[] args) {
		// 221027 문자열 -> char형 배열로 리턴
		String word = "Study with me";

		char[] array = word.toCharArray();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}