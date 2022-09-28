package com.basicprogramming.Interface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new CalculatorImpl();
		
		long number1;
		long number2;
		
		System.out.print("첫 번째 숫자를 입력하세요> ");
		number1 = sc.nextLong();
		
		System.out.print("두 번째 숫자를 입력하세요> ");
		number2 = sc.nextLong();
		
		System.out.println("---------------------------------");
		System.out.println("더하기 연산 결과 :"+calculator.add(number1, number2));
		System.out.println("빼기 연산 결과 :"+calculator.subtract(number1, number2));
		System.out.println("곱하기 연산 결과 :"+calculator.multiply(number1, number2));
		System.out.println("나누기 연산 결과 :"+calculator.divide(number1, number2));
		
		sc.close();
		
	}
}
