package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSimple {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//0~3번 인덱스까지
		list.add("0번 인덱스에 객체 추가");
		list.add("그럼 이 놈은 1번방일까요 3번방일까요?");
		list.add("박정민"); //3번으로 밀려남
		list.add(2, "인덱스 지정하여 2번에 직접 추가");
		
		//4~6번 인덱스까지
		list.add(null); //null도 추가 가능
		list.add(5, "ㅋㅋ");
		list.add("-----경계선-----");
		
		//8번에
//		list.add(8, "추가할 수 없음"); //7번 인덱스가 없어 추가할 수 없음-차례대로 저장되는 특성
		
		//콘솔에 출력
		System.out.println("[ArrayList]");
		for(int i=0; i<list.size(); i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
	
	}
}
