package Project;

public class Contact {
	//field
	private String name;
	private String phoneNumber; //숫자로 받아서 포맷 할수도 있음
	private String mail;
	private String address;
	private String birthday;
	private String group;
	
	//생성자-기본
	Contact(){	
	}
	
	//생성자
	Contact(String name, String PhoneNumber, String mail, String address, String birthday, String group){
		this.name = name;
		this.phoneNumber = PhoneNumber;
		this.mail = mail;
		this.address = address;
		this.birthday = birthday;
		this.group = group;		
	}
	
	//getter And setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	//setter-틀린듯 사용자 정보 입력, 매개 변수 활용????
//	void setInfo(String name, String number, String mail, String adress, String birthday, String group) {
//		this.name = name;
//		this.number = number;
//		this.mail = mail;
//		this.adress = address;
//		this.birthday = birthday;
//		this.group = group;
//	}
	
	//Method-그룹 정보 변경
	void changeGroupInfo() {
		if(group.equals("가족")) {
			group = "친구";
		}else {
			group = "가족";
		}
	}
	
	//Method-어레이 리스트에 직접 입력받기
	
	//Method-정보 출력
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("이메일: " + mail);
		System.out.println("주소: " + address);
		System.out.println("생일: " + birthday);
		System.out.println("그룹: " + group);	
	}
}

class SmartPhone2 {
	
}

