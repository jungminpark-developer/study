package codingtest.lv1;

public class SearchForCharInAString {

	boolean solution(String s) {
		//���ڿ� ������ p�� y�� ���� ã��-���α׷��ӽ� 1�ܰ�
		s = s.toLowerCase();
		int count=0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p') {
				count++;
			}else if(s.charAt(i) == 'y') {
				count--;
			}
		}

		if(count == 0) {
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		//����-p�� y�� ������ ���ٸ� true
		SearchForCharInAString test = new SearchForCharInAString();
		System.out.println(test.solution("pPolYyYmorphism")); //p�� y�� 3����
	}
}