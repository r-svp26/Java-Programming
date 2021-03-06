package com.linkedlist.ds;

import java.util.NoSuchElementException;

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

	/* To add First Node in Doubly-Linked-List */
	public void insert_At_First(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;			// To increase the size of Doubly-Linked-List
	}

	/* To add Last Node in Doubly-Linked-List */
	public void insert_At_Last(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;			// To increase the size of Doubly-Linked-List
	}

	/* To Delete First Node of Doubly-Linked-List */
	public ListNode delete_First_Node() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;			// To decrease the size of Doubly-Linked-List
		return temp;
	}
	
	/* To Delete Last Node of Doubly-Linked-List */
	public ListNode delete_Last_Node(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp= tail;
		if(head==tail){
			head=null;
		}else{
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;            // To decrease the size of Doubly-Linked-List
		return temp; 
	} 
 
	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();

		/* To add First Node in Doubly-Linked-List */
		dll.insert_At_First(22);
		dll.insert_At_First(1);
		dll.insert_At_First(10);

		/* To add Last Node in Doubly-Linked-List */
		dll.insert_At_Last(33);
		dll.insert_At_Last(44);

		dll.delete_First_Node();
		dll.delete_Last_Node();

		System.out.println("Doubly-Linked-List in forward direction");
		dll.display_In_Forward();
		System.out.println("Doubly-Linked-List in backward direction");
		dll.display_In_Backward();
		System.out.println("The Size of Doubly-Linked-List ");
		System.out.println(dll.size());

	}
}
