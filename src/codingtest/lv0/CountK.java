package codingtest.lv0;

public class CountK {

	public int solution(int i, int j, int k) {
		// k�� ����-���α׷��ӽ� 0�ܰ�
		int answer = 0;
		String word = "";
		String[] wordArray;

		for (int a = i; a <= j; a++) {
			word = String.valueOf(a);
			wordArray = word.split("");
			for (int b = 0; b < word.length(); b++) {
				if (wordArray[b].equals(String.valueOf(k))) {
					answer++;
				}
			}
		}

		return answer;
	}
}