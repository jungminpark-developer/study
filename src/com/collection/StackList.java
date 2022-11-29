package com.collection;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		// 221129 참고:http://www.tcpschool.com/java/java_collectionFramework_stackQueue
		Stack<Integer> stack = new Stack<Integer>();

		// push() 요소 저장
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);

		// peek() 요소 반환-가장 마지막으로 저장된 55가 반환됨
		System.out.println(stack.peek());
		System.out.println(stack);

		// pop() 요소 제거-가장 마지막으로 저장된 55가 제거됨
		stack.pop();
		System.out.println(stack);

		// search() 요소의 인덱스 검색-가장 마지막으로 저장된 데이터가 1로 시작
		System.out.println("44의 인덱스: " + stack.search(44));
		System.out.println("11의 인덱스: " + stack.search(11));
		System.out.println("77의 인덱스: " + stack.search(77) + " <--- 없음");

	}
}