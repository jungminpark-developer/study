package api.string;

public class IndexOf {

	public static void main(String[] args) {
		// 221012 특정 문자 위치 찾기
		String address = "서울시 마포구 대흥동";
		int index = address.indexOf("마포구");
		System.out.println("1. 마포구의 시작위치: " + index);

		// 찾는 문자열이 없다면 -1을 리턴
		System.out.println("2. 영등포구를 찾은 결과: " + address.indexOf("영등포구"));

		System.out.println("3. if를 사용하여 인천 찾기");
		if (address.indexOf("인천") == -1) {
			System.out.println("-해당 주소지는 인천이 아닙니다.");
		} else {
			System.out.println("-해당 주소지는 인천이 맞습니다.");
		}

	}
}