package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		//메뉴 생성
		HashSetCoffeeMenu menu1 = new HashSetCoffeeMenu("아메리카노", 3000, 120);
		HashSetCoffeeMenu menu2 = new HashSetCoffeeMenu("카페라떼", 3500, 110);
		HashSetCoffeeMenu menu3 = new HashSetCoffeeMenu("밀크티", 4000, 80);
		
		//HashSet 생성 후 값 입력
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
