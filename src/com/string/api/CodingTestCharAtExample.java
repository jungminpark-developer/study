package com.string.api;

public class CodingTestCharAtExample {

	public boolean solution(String s) {
		//220924 문자열 내 p와 y의 개수 확인하기-charAt 사용
		
		s = s.toLowerCase();
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p') {
				count++;
			}else if(s.charAt(i) == 'y') {
				count--;
			}
		}
		
		if(count == 0) {
			return true;
		}else{
			return false;
		}
	
	}
}
