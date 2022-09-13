package GitHub;

import java.util.ArrayList;
import java.util.Scanner;

public class CarExample_Lee {

	static ArrayList<Car> list = new ArrayList<Car>(); //객체 저장
	static Scanner sc = new Scanner(System.in); //각 메소드에서 키보드로 입력 받기

	//Method-통합 프로그램
	static void menuPlay() {
		int selectNo; //메뉴 선택-스캐너로 입력받을 숫자 저장

		while(true) { //무한루프-4번 누르면 return으로 메소드가 종료되어 빠져나감
			System.out.println("--------------------------------------");
			System.out.println(" 1.정보입력 | 2.전체조회 | 3.검색조회 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("기능 선택> ");
		
		selectNo = sc.nextInt(); // 선택한 번호 입력
			
		switch(selectNo) {
			case 1: //키보드로 정보입력 받기
				regCar();
				break;
			case 2: //모든 정보조회
				showCar();
				break;
			case 3: //자동차 검색
				serchCar();	
				break;
			case 4: //프로그램 종료
				exitProgram();
				return;			
			default:
				System.out.println("-메뉴에 없는 번호를 입력했습니다.");
				System.out.println("-1번부터 4번을 다시 입력하세요.\n");
			} //switch문 종료	
		} //while문 종료	
	}

	//Method-정보를 키보드로 입력하여 저장
	static void regCar() {
		SportCar tmp = new SportCar();
		
		String tmp_carModelName;
		int tmp_carMaxSpeed;
		int tmp_carModelNo;

		System.out.println("\n<정보 입력>");
	  	System.out.print("-자동차 모델 번호를 입력하세요. ");
		tmp_carModelNo = sc.nextInt();
		System.out.print("-자동차 모델명을 입력하세요. ");
		tmp_carModelName = sc.next();
		System.out.print("-최대 속도를 입력하세요. ");
		tmp_carMaxSpeed = sc.nextInt();
		tmp.setCarInfo(tmp_carModelNo, tmp_carModelName, tmp_carMaxSpeed);//Car 클래스의 Setter 사용

		//리스트방식은 .add() 로 저장해주면됨.
		list.add(tmp);
		System.out.println("현재까지 " + list.size() + "대의 정보를 성공적으로 입력했습니다.\n");
	}

	//Method-저장된 모든 정보를 출력
	static void showCar() {
		System.out.println("\n<전체 조회>");
		for(int i=0; i<list.size(); i++) {
		System.out.println((i+1) + "번 목록 자동차");
		list.get(i).showCarInfo(); //컨테이너 -> 자동차가져옴(get) -> 자동차정보출력(put_Car_Info)	
		System.out.println();
		}
	}

	//Method-프로그램 종료, 현재 규모에선 불필요하지만, 나중에 확장을 대비해 미리 설계
	//예시)데이터베이스 종료, 사용하던 메모리 청소 등 
	static void exitProgram() {
		System.out.println("-프로그램을 종료합니다.");
	}

	//Method-검색 기능, 검색된 정보만 출력
	static void serchCar() {

		int searchByModelNo; //검색어가 모델번호일 경우 사용
		String searchByModelName; //검색어가 모델이름일 경우 사용
		int searchByMaxSpeed; //검색어가 최대속도일 경우 사용
		
		System.out.println("\n<검색 조회>");
		System.out.println("--------------------------------------");
		System.out.println(" 1.자동차모델번호 | 2.자동차모델명 | 3.최대속도 ");
		System.out.println("--------------------------------------");
		System.out.print("검색 목록 선택> ");
		int searchCategory = sc.nextInt();//자동차모델이름

		//검색할 것이 어떤것인가에 따른 분류
		switch(searchCategory) {
			case 1:
			    System.out.print("자동차 모델 번호 입력> ");//검색하고싶은 모델번호입력
		    	searchByModelNo = sc.nextInt();	//
		    	//검색하여 정보를 비교
		    	for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getModelNo()==searchByModelNo) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
		      	break;
			case 2:
			    System.out.print("자동차 모델명 입력> ");
			  	searchByModelName = sc.next();	//검색하고싶은 모델이름입력
			  	//검색하여 정보를 비교
				for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getModelName().equals(searchByModelName)) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
		    	break;
			case 3:
			  	System.out.print("최대 속도 입력> ");//검색하고싶은 최대속도입력
			  	searchByMaxSpeed = sc.nextInt();	 
		    	//검색하여 정보를 비교
			  	for(int i=0; i<list.size(); i++) {
		    		if(list.get(i).getMaxSpeed()==searchByMaxSpeed) {
		    			list.get(i).showCarInfo();
		    		}
		    	}
			  	break;
	  		default:
	  			System.out.println("-메뉴에 없는 번호를 입력했습니다.");
				System.out.println("-1번부터 3번을 다시 입력하세요.\n");
		  }	//switch문 종료	
		System.out.println(); //줄바꿈(개행)
	}

	public static void main(String[] args) {
		//통합 프로그램 실행
		menuPlay();
	}
}
