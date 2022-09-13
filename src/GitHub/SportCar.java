package GitHub;

import java.util.ArrayList;

public class SportCar extends Car {
	//field
	private float chargingFuel = 0;
	
	//Getter-값 초기화(?아직 모름?)
	public float getchargingFuel() {
		return chargingFuel;
	}
	
	//Method-일회성 연료 충전
	//정상적으로 주유가 될 때만 남아있는 연료량을 확인하는 메세지 출력
	protected void chargingFuel(float extraFuel){
		if(extraFuel < 10) {
			System.out.println("※최소 10 이상의 연료를 주유하세요.\n");
			return;
		}else if(chargingFuel + extraFuel > 100) {
			System.out.println("※최대 연료량을 초과했습니다.\n");
			return;
		}else {
			this.chargingFuel += extraFuel;
			System.out.println("※이번에 채운 연료량: " + extraFuel);
		}
		System.out.println("남아있는 연료량: " + chargingFuel + "\n");
	}
	
	//ArrayList

	
	//Method-부스터 사용
	protected void useSpeedBooster() {
		chargingFuel = chargingFuel-10;
		System.out.println("※부스터로 연료 10을 사용했습니다.");
		System.out.println("남아있는 연료량: " + chargingFuel + "\n");
	}
	
	//Method-실시간 연료량 확인 출력
	protected void remainingFuel() {
		System.out.println("※현재 연료량을 확인합니다.");
		System.out.println("실시간 연료량 확인: " + chargingFuel + "\n");
	}
}
	

