package codingtest;

public class ArrayAvg {

	public static void main(String[] args) {
		//배열의 평균값 구하기-프로그래머스 0단계
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double answer = 0;

        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }

//		answer = answer / numbers.length;
        System.out.println(answer / numbers.length);
		           
	}
}
