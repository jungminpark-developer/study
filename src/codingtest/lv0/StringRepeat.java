package codingtest.lv0;

public class StringRepeat {
	
	public String solution(String my_string, int n) {
		//���� �ݺ� ����ϱ�-���α׷��ӽ� 0�ܰ�
		//1. split
		String[] array = my_string.split("");
		String answer = "";
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<n; j++) {
				answer += array[i];		
			}
		}
		
		/* 2. �ٸ� ����� Ǯ�� ���� charAt���� Ǯ��
		for(int i=0; i<my_string.length(); i++) {
			for(int j=0; j<n; j++) {
				answer += my_string.charAt(i);
			}
		}
		*/
		
        return answer;
	}
	
	public static void main(String[] args) {
		//����
		StringRepeat test = new StringRepeat();
		System.out.println(test.solution("Jpark", 2));

		//�����
		System.out.println("---------------------");
		String test2 = "k";
		System.out.println(test2.replace(test2, test2+test2+test2));	
	}
}