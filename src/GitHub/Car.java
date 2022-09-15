package GitHub;

public class Car {
	//field
	private int modelNo;
	private String modelName;
	private int maxSpeed;
	
	//getter and setter	
	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	//자동차 정보 매개변수로 입력하기
	protected void setCarInfo(int modelNo, String modelName, int maxSpeed) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	//Method-출력 전용
	protected void showCarInfo() {
		System.out.println("-모델 번호: " + modelNo);
		System.out.println("-모델명: " + modelName);
		System.out.println("-최대 속도: " + maxSpeed + "km/h");
	}
	
	
}
