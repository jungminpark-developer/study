package com.collection;

public class HashSetCoffeeMenu {
	//HashSetExample1�� ����ϴ� ���̺귯��-221007 ��ü ����
	
	//field
	private String name;
	private int price;
	private int caffeine; //ī���� �Է�
	
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