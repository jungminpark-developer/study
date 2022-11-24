package codingtest.lv0;

import java.util.Scanner;

public class BasicNestedLoop {
	
	public static void main(String[] args) {
		// 직각삼각형 출력하기-프로그래머스 0단계
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}