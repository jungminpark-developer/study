package com.collection;

public class HashSetCoffeeMenu {
	//HashSetExample1에 사용하는 라이브러리-221007 자체 제작
	
	//field
	private String name;
	private int price;
	private int caffeine; //카페인 함량
	
	//constructor
	HashSetCoffeeMenu(String name, int price, int caffeine){
		this.name = name;
		this.price = price;
		this.caffeine = caffeine;
	}
	
	@Override
	public String toString() {
		return "name:"+name+"\tprice:"+price+"won"+"\tcaffeine:"+caffeine+"mg";
	}
	
}