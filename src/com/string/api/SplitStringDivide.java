package com.string.api;

public class SplitStringDivide {

	public static void main(String[] args) {
		//220924 ���ڿ� �� p�� y�� ���� Ȯ���ϱ�-���ڿ� �и� split ���
		
		boolean answer = true;
		String s = "pPoooyY"; //���� ���
		
		int countP=0; //p�� ������ ����
		int countY=0; //y�� ������ ����
		String[] array; //�߸� ���ڸ� ���� �迭
		
		array = s.split(""); //�� ���ھ� �и�
		
		for(int i=0; i<array.length; i++) {
			System.out.println("array["+i+"]:"+array[i]); //������� Ȯ���غ��� ��������
			if(array[i].equals("p") || array[i].equals("P")){
				countP++;
			}
			if(array[i].equals("y") || array[i].equals("Y")){
				countY++;
			}
		}
		
		if(countP==countY) {
			answer=true;
		}else {
			answer=false;
		}
	
		System.out.println("p,P�� ����:" + countP);
		System.out.println("y,Y�� ����:" + countY);
		System.out.println("answer: "+answer);
		
	}
}
