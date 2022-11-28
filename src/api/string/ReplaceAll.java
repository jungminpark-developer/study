package api.string;

public class ReplaceAll {

	public static void main(String[] args) {
		// 221125 문자열 치환
		// 정규표현식 사용이 가능하다. 정규표현식에 대한 내용은 RegularExpression.txt 확인
		String word = "nice to meet you";
		word = word.replaceAll("[aeiou]", "");
		System.out.println(word);
		
		String word2 = "0123456789123";
		word2 = word2.replaceAll("[^132]", " ");
		System.out.println(word2);
		
		String word3 = "abcdefghicdefgjkABCDEFGㄱㄴㄷ";
		word3 = word3.replaceAll("[c-g B-G]", "");
		System.out.println(word3);
		
	}
}