package codingtest.lv1;

public class FlipNaturalWater {
	
    public int[] solution(long n) {
    	//�ڿ��� ������ �迭�� �����-���α׷��ӽ� 1�ܰ�
    	
    	String length = "" + n;	//String�� n �߰�
        int[] answer = new int[length.length()]; //String�� ���ڼ� ������ �迭 ���� 
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = (int)(n % 10); //(int) n % 10 �� ����-�����ϱ�
        	n /= 10;
        }
        
        return answer;
    }
}