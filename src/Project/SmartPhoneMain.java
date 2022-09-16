package Project;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//객체 생성
		SmartPhone s1 = new SmartPhone();
		
		
		
		//키보드로 입력받아 객체 생성
		s1.inputContactData();
		
		//키보드로 배열에 연락처 저장
		s1.addContact();
		
		//모든 정보 출력
		s1.printAllContact();
		
		
	}

}
