package GitHub;

public class Car {
	//field
	private int modelNo;
	private String modelName;
	private int maxSpeed;
	
	//Setter-자동차 정보 매개변수로 입력하기
	protected void setCarInfo(int modelNo, String modelName, int maxSpeed) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	//Getter
	protected int getModelNo() {
		return modelNo;
	}
	protected String getModelName() {
		return modelName;
	}
	protected int getMaxSpeed() {
		return maxSpeed;
	}
	
	//Method-출력 전용
	protected void showCarInfo() {
		System.out.println("-모델 번호: " + modelNo);
		System.out.println("-모델명: " + modelName);
		System.out.println("-최대 속도: " + maxSpeed + "km/h");
	}
	
	
}
