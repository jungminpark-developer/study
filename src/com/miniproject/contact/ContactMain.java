package com.miniproject.contact;

public class ContactMain {

	public static void main(String[] args) {
		//객체 생성-연락처 데이터 저장
		Contact s1 = new Contact("박정민", "010-8405-1110", "jpark.dev@daum.net", "인천시 계양구 계양대로", "11-03", "친구");
		
//		String A = "12344";
//		
//		System.out.println(A.length());
		
		//생성된 인스턴스의 정보 출력
		s1.printInfo();
		
		System.out.println("--------------------------");
		
		//그룹 정보 변경
		s1.setGroup("가족");
//		s1.changeGroupInfo(); //내 메소드 활용한거...
		
		//출력 메소드 다시 실행
		s1.printInfo();
		
		
		System.out.println("--------------------------");
		
		System.out.println(s1.getAddress());
		
		//setter로 address 필드의 값 변경 후 출력
		s1.setAddress("서울시 마포구");
		System.out.println(s1.getAddress());
		
//		s1.printInfo();
	}

}
