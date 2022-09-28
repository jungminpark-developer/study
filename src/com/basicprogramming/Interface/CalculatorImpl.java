package com.basicprogramming.Interface;

public class CalculatorImpl implements Calculator{

	//method
	@Override
	public long add(long n1, long n2) {
		return n1 + n2; //피드백 받은 코드
		
		/* 원래 코드
		 * long add = n1 + n2;
		 * return add; */
	}
	
	@Override
	public long subtract(long n1, long n2) {
		return n1 - n2;
	}
	
	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}
	
	@Override
	public long divide(long n1, long n2) {
		return n1 / n2;
	}

}
