package com.miniproject.contact;

public class ContactMain {

	public static void main(String[] args) {
		//��ü ����-����ó ������ ����
		Contact s1 = new Contact("������", "010-8405-1110", "jpark.dev@daum.net", "��õ�� ��籸 �����", "11-03", "ģ��");
		
//		String A = "12344";
//		
//		System.out.println(A.length());
		
		//������ �ν��Ͻ��� ���� ���
		s1.printInfo();
		
		System.out.println("--------------------------");
		
		//�׷� ���� ����
		s1.setGroup("����");
//		s1.changeGroupInfo(); //�� �޼ҵ� Ȱ���Ѱ�...
		
		//��� �޼ҵ� �ٽ� ����
		s1.printInfo();
		
		
		System.out.println("--------------------------");
		
		System.out.println(s1.getAddress());
		
		//setter�� address �ʵ��� �� ���� �� ���
		s1.setAddress("����� ������");
		System.out.println(s1.getAddress());
		
//		s1.printInfo();
	}

}
