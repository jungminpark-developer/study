package codingtest.lv1;

public class RemoveMinimum {

	public int[] solution(int[] arr) {
    	//���� ���� �� �����ϱ�-���α׷��ӽ� 1�ܰ�

        int[] answer;
        int temp=0;
		int min=arr[0];
		int i;
        
		//�Է¹��� �迭�� ���̰� 1�̶�� -1 �Է� �� ����
        if(arr.length == 1) {
        	arr[0]= -1;
        	return arr;
        	
        //�ƴ϶�� ���� ���� �� �����ϰ� ����
        }else {
         
            //�迭 Ž�� ���ּҰ� ���ϱ�
            for(i=0; i<arr.length; i++) {
            	if(min > arr[i]) {
            		min = arr[i];
                    temp = i;
                }	 
            }

            answer = new int[arr.length-1];

            //�ּҰ� �ڸ����� �����
            for(i=temp; i<arr.length-1; i++) {
            	arr[i] = arr[i+1];
            }

            //�迭 �Űܴ��
            for(i=0; i<answer.length; i++) {
                answer[i] = arr[i];
                System.out.println(answer[i]);
            }
        
        } //else�� ����
        return answer;
    }
}
