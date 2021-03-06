package com.queue.ds;

import java.util.NoSuchElementException;

public class Queue {
	
	private ListNode front;
	private ListNode rear;
	private int length;

	public Queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	public class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/* Size of the Queue */
	public int length() {
		return length;
	}

	/* Queue Is Empty or Not */
	public boolean isEmpty() {
		return length == 0;
	}

	/* Print the Data */
	public void display() {
		if (isEmpty()) {
			return;
		}
		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.next;
		}
		System.out.println("null");
	}

	/* To add Elements in Queue */
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	/* To remove an Element from Queue */
	public int dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		length--;
		return result;
	}

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(30);
		System.out.println(queue.isEmpty());

		queue.display();
		System.out.println(queue.length());

		queue.dequeue();
		queue.display();
		System.out.println(queue.length());

	}

}
