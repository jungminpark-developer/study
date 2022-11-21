package api.math;

public class Lotto {

	public static void main(String[] args) {
		// 로또-Math.random을 활용한 중복되지 않는 번호 뽑기
		// 직접 제작: https://lucky-park.tistory.com/16

		// 로또 번호를 저장할 int 배열 선언
		int[] lottoList = new int[6];

		System.out.println("로또 당첨번호");
		for (int i = 0; i < lottoList.length; i++) {
			lottoList[i] = (int) (Math.random() * 6) + 1;

			for (int j = 0; j < i; j++) {
				// 새로 뽑은 숫자가 기존 배열에 중복 됐는지 검색
				while (lottoList[i] == lottoList[j]) {
					lottoList[i] = (int) (Math.random() * 6) + 1;
					j = 0; // 다시 뽑은 숫자를 0번 인덱스부터 재검색하기 위해 j를 0으로 초기화
				}
			}

			System.out.println(i + 1 + "번 공: " + lottoList[i]);
		}

	}
}