package com.linkedlist.ds;

public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;

	/* Main class constructor */
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	/* Inner class */
	private class ListNode {
		private int data;
		private ListNode previous;
		private ListNode next;

		/* Inner class constructor */
		public ListNode(int data) {
			this.data = data;
		}
	}

	/* Size of Doubly-Linked-List */
	public int size() {
		return length;
	}

	/* To Check Doubly-Linked-List is Empty or Not */
	public boolean isEmpty() {
		return length == 0;
	}

	/* Print Doubly-Linked-List in forward direction */
	public void display_In_Forward() {
		if (head == null) {
			return;
		}
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	/* Print Doubly-Linked-List in forward direction */
	public void display_In_Backward() {
		if (tail == null) {
			return;
		}
		ListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public void insert_At_First(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		/* To add elements at the beginning */
		dll.insert_At_First(22);
		dll.insert_At_First(1);
		dll.insert_At_First(10);

		System.out.println("Doubly-Linked-List in forward direction");
		dll.display_In_Forward();
		System.out.println("Doubly-Linked-List in forward direction");
		dll.display_In_Backward();
		System.out.println("The Size of Doubly-Linked-List ");
		System.out.println(dll.size());

	}
}
