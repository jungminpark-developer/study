package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		//�޴� ����
		HashSetCoffeeMenu menu1 = new HashSetCoffeeMenu("�Ƹ޸�ī��", 3000, 120);
		HashSetCoffeeMenu menu2 = new HashSetCoffeeMenu("ī���", 3500, 110);
		HashSetCoffeeMenu menu3 = new HashSetCoffeeMenu("��ũƼ", 4000, 80);
		
		//HashSet ���� �� �� �Է�
		Set<HashSetCoffeeMenu> set = new HashSet<>();
		set.add(menu1);
		set.add(menu2);
		set.add(menu3);
		
		System.out.println("HashSet Size:"+set.size());
		Iterator<HashSetCoffeeMenu> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
