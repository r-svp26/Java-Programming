package com.stack.ds;

import java.util.EmptyStackException;

public class Stack {
	
	private ListNode top;
	private int length;
	
	public Stack() {
		top = null;
		length = 0;
	}

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	/* Size of the Stack */
	public int length() {
		return length;
	}

	/* Check Stack is Empty or Not */
	public boolean isEmpty() {
		return length == 0;
	}

	/* Add elements in Stack */
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}

	/* Remove elements in Stack */
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	/* Return last inserted element */
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(12);
		st.push(5);
		st.push(2);
		st.push(6);

		System.out.println(st.isEmpty());
		System.out.println(st.length());

		System.out.println(st.peek()); // Before pop method
		System.out.println(st.pop());
		System.out.println(st.peek()); // after pop method
		System.out.println(st.pop());
	}
}
