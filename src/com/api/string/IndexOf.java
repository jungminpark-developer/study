package com.api.string;

public class IndexOf {

	public static void main(String[] args) {
		//221012 문자열 API-문자열 시작 위치 찾기
		String address = "서울시 마포구 대흥동";
		int index = address.indexOf("마포구");
		System.out.println("마포구의 시작위치: "+index);
		
		System.out.println("특정 문자열이 포함되지 않을 때: "+address.indexOf("영등포구"));
		if(address.indexOf("인천")==-1) {
			System.out.println("주소지가 인천이 아닙니다.");
		}else {
			System.out.println("주소지가 인천이 맞습니다.");
		}
		
	}
}
