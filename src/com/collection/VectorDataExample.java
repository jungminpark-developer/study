package com.collection;

import java.util.List;
import java.util.Vector;

public class VectorDataExample {

	public static void main(String[] args) {
		
		List<VectorData> data = new Vector<>();
		
		//��ü ����
		data.add(new VectorData("������1","205","107"));
		data.add(new VectorData("������2","148","47"));
		data.add(new VectorData("������3","168","80"));
		data.add(new VectorData("������4","173","65"));
		data.add(new VectorData("������5","162","43"));
		
		//��ü ����
		data.remove(3);
		
		//getter Ȱ���Ͽ� ��ü ���� ���
		System.out.println("[getter�� Ȱ���Ͽ� ��ü ���� ���]");
		for(int i=0; i<data.size(); i++) {
			System.out.println("["+i+"]"+data.get(i).getName()+"  "+data.get(i).getHeight()+"  "+data.get(i).getWeight());
		}
		
		System.out.println(); //�ٹٲ�
		
		//toString Ȱ���Ͽ� ��ü ���� ���
		System.out.println("[toString�� Ȱ���Ͽ� ��ü ���� ���]");
		for(int i=0; i<data.size(); i++) {
			System.out.println("["+i+"]"+data.get(i));
		}
		
		
	}

}
