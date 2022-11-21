package api.string;

import java.util.StringTokenizer;

public class X_TokenizerMain {

	public static void main(String[] args) {
		// 추가 공부 필요
		String str1 = "오늘은 졸리지 않습니다.";
		String str2 = "2022/09/27";
		String str3 = "박정민&박첨지, 홍길동+콩길동, 김자바-김자스";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");
		StringTokenizer tokenizer3 = new StringTokenizer(str3, "&|,|-|+| ");

		System.out.println("tokenizer1: " + tokenizer1.countTokens());
		System.out.println("tokenizer2: " + tokenizer2.countTokens());
		System.out.println("tokenizer3: " + tokenizer3.countTokens());

		while (tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}

		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}

		while (tokenizer3.hasMoreTokens()) {
			System.out.println(tokenizer3.nextToken());
		}

	}
}