package com.api.math;

public class MathRandomExample1 {

	public static void main(String[] args) {
		//Math.random 메소드를 활용해서 숫자 뽑기
			
		for(int i=0; i<10; i++) {
			//1부터 6까지 뽑기
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
		}
	}

}
