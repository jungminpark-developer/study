package codingtest.lv0;

public class DividePizza1 {
		//���� ���� �Ա� (1)-���α׷��ӽ� 0�ܰ�
		public int solution(int n) {
			int answer = 1;

			while(7 * answer < n){
				answer++;
			}

			return answer;
	    }
	
	public static void main(String[] args) {
		//����
		DividePizza1 test = new DividePizza1();
		
		System.out.println("2���� �ּ� �������� �Ա� ���ؼ� �ּ� "+test.solution(2)+"���� �ʿ��մϴ�.");
		System.out.println("11���� �ּ� �������� �Ա� ���ؼ� �ּ� "+test.solution(11)+"���� �ʿ��մϴ�.");
		System.out.println("21���� �ּ� �������� �Ա� ���ؼ� �ּ� "+test.solution(21)+"���� �ʿ��մϴ�.");
		System.out.println("22���� �ּ� �������� �Ա� ���ؼ� �ּ� "+test.solution(22)+"���� �ʿ��մϴ�.");
		
	}
}
