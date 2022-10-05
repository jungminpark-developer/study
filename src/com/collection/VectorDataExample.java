package com.collection;

import java.util.List;
import java.util.Vector;

public class VectorDataExample {

	public static void main(String[] args) {
		
		List<VectorData> data = new Vector<>();
		
		//객체 삽입
		data.add(new VectorData("박정민1","205","107"));
		data.add(new VectorData("박정민2","148","47"));
		data.add(new VectorData("박정민3","168","80"));
		data.add(new VectorData("박정민4","173","65"));
		data.add(new VectorData("박정민5","162","43"));
		
		//객체 제거
		data.remove(3);
		
		//getter 활용하여 객체 정보 출력
		System.out.println("[getter를 활용하여 객체 정보 출력]");
		for(int i=0; i<data.size(); i++) {
			System.out.println("["+i+"]"+data.get(i).getName()+"  "+data.get(i).getHeight()+"  "+data.get(i).getWeight());
		}
		
		System.out.println(); //줄바꿈
		
		//toString 활용하여 객체 정보 출력
		System.out.println("[toString을 활용하여 객체 정보 출력]");
		for(int i=0; i<data.size(); i++) {
			System.out.println("["+i+"]"+data.get(i));
		}
		
		
	}

}
