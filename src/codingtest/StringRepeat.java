package codingtest;

public class StringRepeat {
	
	public String solution(String my_string, int n) {
		//���� �ݺ� ����ϱ�-���α׷��ӽ� 0�ܰ�
		//ù �õ�-split Ǯ��
		String[] array = my_string.split("");
		String answer = "";
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<n; j++) {
				answer += array[i];		
			}
		}
		
		/*�ٸ� ����� Ǯ�� ���� charAt���� �����Ͽ� Ǯ��
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