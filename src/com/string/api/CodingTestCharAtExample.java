package com.string.api;

public class CodingTestCharAtExample {

	public boolean solution(String s) {
		//220924 ���ڿ� �� p�� y�� ���� Ȯ���ϱ�-charAt ���
		
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
