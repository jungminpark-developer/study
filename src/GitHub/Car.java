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

	//�ڵ��� ���� �Ű������� �Է��ϱ�
	protected void setCarInfo(int modelNo, String modelName, int maxSpeed) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	//Method-��� ����
	protected void showCarInfo() {
		System.out.println("-�� ��ȣ: " + modelNo);
		System.out.println("-�𵨸�: " + modelName);
		System.out.println("-�ִ� �ӵ�: " + maxSpeed + "km/h");
	}
	
	
}
