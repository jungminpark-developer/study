package codingtest.lv0;

public class DuplicateNumber {

	public int solution(int[] array, int n) {
		//�ߺ��� ���� ���� ���ϱ�-���α׷��ӽ� 0�ܰ�
		int answer = 0;

		for(int i=0; i<array.length; i++){
			if(array[i] == n) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		//����
		DuplicateNumber test = new DuplicateNumber();
		int[] array = { 1, 3, 5, 3 , 7, 2, 11 };
		System.out.println("�迭 �� 3�� ����: "+test.solution(array, 3));

	}
}
