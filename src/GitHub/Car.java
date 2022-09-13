package GitHub;

public class Car {
	//field
	private int modelNo;
	private String modelName;
	private int maxSpeed;
	
	//Setter-�ڵ��� ���� �Ű������� �Է��ϱ�
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
	
	//Method-��� ����
	protected void showCarInfo() {
		System.out.println("-�� ��ȣ: " + modelNo);
		System.out.println("-�𵨸�: " + modelName);
		System.out.println("-�ִ� �ӵ�: " + maxSpeed + "km/h");
	}
	
	
}
