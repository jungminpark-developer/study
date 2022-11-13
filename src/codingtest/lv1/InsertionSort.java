package codingtest.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

	public long solution(long n) {
		// ���� ������������ ��ġ�ϱ�-���α׷��ӽ� 1�ܰ�
		ArrayList<Long> array = new ArrayList<>();
		long answer = 0;

		// �ڸ��� �и�
		while (n > 0) {
			array.add(n % 10);
			n = n / 10;
		}

		// ���� ���ķ� �������� ����
		for (int i = 1; i < array.size(); i++) { // �� ��°�� 1�� �ε������� ��
			for (int j = i; j > 0; j--) {
				if (array.get(j - 1) > array.get(j)) {
					Collections.swap(array, j, j - 1);
				}
			}
		}

		// �ڸ����� ���ؼ� ������ �����
		int timesNumber = 1;
		for (int i = 0; i < array.size(); i++) {
			answer += array.get(i) * timesNumber;
			timesNumber *= 10;
		}

		return answer;
	}

	public static void main(String[] args) {
		// ����
		InsertionSort test = new InsertionSort();
		test.solution(546271);
		
String answer = "";
String s=" try hello world";

		char a = 32;
		System.out.println("���� =" + a);
	
        
        for (int i=0; i<s.length(); i++) {
             if (i % 2 == 0) {
                 answer += s.charAt(i) - 32;
             } else {
                 answer += s.charAt(i);
             }
             
             
	}
	}
}