package com.api.string;

public class indexOf {

	public static void main(String[] args) {
		//221012 ���ڿ� API-���ڿ� ���� ��ġ ã��
		String address = "����� ������ ���ﵿ";
		int index = address.indexOf("������");
		System.out.println("�������� ������ġ: "+index);
		
		System.out.println("Ư�� ���ڿ��� ���Ե��� ���� ��: "+address.indexOf("��������"));
		if(address.indexOf("��õ")==-1) {
			System.out.println("�ּ����� ��õ�� �ƴմϴ�.");
		}else {
			System.out.println("�ּ����� ��õ�� �½��ϴ�.");
		}
		
	}
}
