package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSimple {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//0~3�� �ε�������
		list.add("0�� �ε����� ��ü �߰�");
		list.add("1�� �߰�");
		list.add("������"); //3������ �з���
		list.add(2, "�ε��� �����Ͽ� 2���� ���� �߰�");
		
		//4~6�� �ε�������
		list.add(null); //null�� �߰� ����
		list.add(5, "����");
		list.add("-----��輱-----");
		
		//8����
//		list.add(8, "�߰��� �� ����"); //7�� �ε����� ���� �߰��� �� ����-���ʴ�� ����Ǵ� Ư��
		
		//�ֿܼ� ���
		System.out.println("[ArrayList]");
		for(int i=0; i<list.size(); i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
	
	}
}
