package com.basicprogramming.Interface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new CalculatorImpl();
		
		long number1;
		long number2;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���> ");
		number1 = sc.nextLong();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���> ");
		number2 = sc.nextLong();
		
		System.out.println("---------------------------------");
		System.out.println("���ϱ� ���� ��� :"+calculator.add(number1, number2));
		System.out.println("���� ���� ��� :"+calculator.subtract(number1, number2));
		System.out.println("���ϱ� ���� ��� :"+calculator.multiply(number1, number2));
		System.out.println("������ ���� ��� :"+calculator.divide(number1, number2));
		
		sc.close();
		
	}
}
