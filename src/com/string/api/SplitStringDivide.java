package com.string.api;

public class SplitStringDivide {

	public static void main(String[] args) {
		//220924 문자열 내 p와 y의 개수 확인하기-문자열 분리 split 사용
		
		boolean answer = true;
		String s = "pPoooyY"; //실험 대상
		
		int countP=0; //p의 개수를 담음
		int countY=0; //y의 개수를 담음
		String[] array; //잘린 글자를 담을 배열
		
		array = s.split(""); //한 글자씩 분리
		
		for(int i=0; i<array.length; i++) {
			System.out.println("array["+i+"]:"+array[i]); //출력으로 확인해보기 생략가능
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
	
		System.out.println("p,P의 개수:" + countP);
		System.out.println("y,Y의 개수:" + countY);
		System.out.println("answer: "+answer);
		
	}
}
