package com.basicprogramming.exceptionhandling;

import java.util.Scanner;

public class NumberTest {

	public static void main(String[] args){
		//����: https://iwbtbitj.tistory.com/44
		
		try {
			//Ű����� ���� �Է� �ޱ�
			System.out.print("�¾ �⵵�� 4�ڸ��� ���ڷ� �Է����ּ���> ");
			Scanner sc = new Scanner(System.in);
			String year = sc.nextLine();
			
			data(inputData(year));
		}catch(InputException e) {
			String message = e.getMessage(); //���� �޼��� ���
			System.out.println(message);
			e.printStackTrace(); //���� ���� �� �ֿܼ� ���
		}
		
	}
	
	public static boolean inputData(String year){
		//���ڸ� �Է��ߴ��� ���ڵ� �Է��ߴ��� ���� Ȯ��
		try {
			Integer.parseInt(year);
			return true;
		}catch(NumberFormatException e){
			return false;
		}

	}

	public static void data(boolean year) throws InputException{
		
		if(year) {
			System.out.println("�Է��Ͻ� �����ʹ� �����Դϴ�.");
		}else {
			throw new InputException("�Է��Ͻ� �����ʹ� ���ڰ� �ƴմϴ�."); //����� ���� ���� �߻�
		}
		
	}
		
}
