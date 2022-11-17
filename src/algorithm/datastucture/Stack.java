package algorithm.datastucture;

public class Stack {
	// 221117 먼저 들어간 자료가 나중에 나오는 자료 구조. 후입선출
	int size = 500; // 스택의 최대 크기
	int[] arr = new int[size];
	int top = 0; // 스택의 현재 크기

	int push(int n) {
		if (top > size) {
			return -1;
		}
		arr[top++] = n;
		return 0;
	}

	int pop() {
		if (top <= 0) {
			return -1;
		}
		return arr[--top];
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}