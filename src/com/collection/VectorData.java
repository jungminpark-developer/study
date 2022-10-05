package com.collection;

public class VectorData {
	//field
	private String name;
	private String height;
	private String weight;
	
	//constructor
	public VectorData(String name, String height, String weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getHeight() {
		return this.height+"cm";
	}
	
	public String getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "�̸�:"+name+" Ű:"+height+"cm"+" ü��:"+weight+"kg";
	}
	
}
