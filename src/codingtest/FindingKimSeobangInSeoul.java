package codingtest;

public class FindingKimSeobangInSeoul {

	public String solution(String[] seoul) {
		//���￡�� �輭�� ã��-���α׷��ӽ� 1�ܰ�
		String x = "";

		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = Integer.toString(i);
				break;
			}	
		}

		return "�輭���� "+x+"�� �ִ�";
	}

	public static void main(String[] args) {
		//Ȯ��
		FindingKimSeobangInSeoul s1 = new FindingKimSeobangInSeoul();
		String[] array = { "jane", "Jung", "Kim", "park" };
		System.out.println(s1.solution(array));
	}
}
