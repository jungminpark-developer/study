package com.api.math;

public class Lotto {

	public static void main(String[] args) {
		//�ζ�-Math.random�� Ȱ���� �ߺ����� �ʴ� ��ȣ �̱�
		int[] lottoList = new int[6];
		
		System.out.println("�ζ� ��÷��ȣ");
		
		for(int i=0; i<lottoList.length; i++) {
						
			lottoList[i] = (int)(Math.random()*6)+1;
			
			for(int j=0; j<i; j++) {
				//���� ���� ���ڰ� ���� �迭�� �ߺ� �ƴ��� �˻�
				while(lottoList[i] == lottoList[j]) {
					lottoList[i] =  (int)(Math.random()*6)+1;
					j=0; //�ٽ� ���� ���ڸ� 0�� �ε������� ��˻��ϱ� ���� j�� 0���� �ʱ�ȭ
				}	
			}
			System.out.println(i+1+"�� ��: "+lottoList[i]);
		}

	}
}