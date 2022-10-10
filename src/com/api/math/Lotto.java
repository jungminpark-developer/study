package com.api.math;

public class Lotto {

	public static void main(String[] args) {
		//중복되지 않는 숫자 뽑기-거의 완성
		int[] lottoList = new int[6];

		for(int i=0; i<lottoList.length; i++) {
						
			lottoList[i] = (int)(Math.random()*6)+1;
			
			for(int j=0; j<i; j++) {
				while(lottoList[i] == lottoList[j]) {
					lottoList[i] =  (int)(Math.random()*6)+1;
					j=0;
				}	
			}
			System.out.println(lottoList[i]);

		}
	
	}
}
