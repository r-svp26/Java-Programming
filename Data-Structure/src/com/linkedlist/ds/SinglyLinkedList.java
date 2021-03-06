package com.linkedlist.ds;

public class SinglyLinkedList {
	
	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/* To display the elements of the SinglyLInkedList */
	public void display() {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	/* To display the elements of Reversed SinglyLInkedList */
	public void display(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	/* To find the length of a SinglyLinkedList */
	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/* To insert data at First index */
	public void insert_At_First(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	/* Insert data at last index */
	public void insert_At_Last(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}

	/* To search the key */
	public boolean search_data(int key) {
		if (head == null) {
			return false;
		}

		ListNode current = head;
		while (current != null) {
			if (current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	/* To remove duplicate elements from Sorted Singly-Linked-List */
	public void duplicate() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	/* To Reverse SinglyLinkedList */
	public ListNode reverse(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
		
		/*
		 * sll.head= new ListNode(10); ListNode second=new ListNode(1); ListNode
		 * third=new ListNode(8); ListNode fourth=new ListNode(11);
		 * 
		 * //Now we'll have to connect them to form a chain
		 * sll.head.next=second; // 10 --->1 second.next=third; // 10
		 * --->1---->8 third.next=fourth; // 10---->1---->8----null
		 */

		/* To insert data at First index */
		sll.insert_At_First(8);
		sll.insert_At_First(3);
		sll.insert_At_First(3);
		sll.insert_At_First(1);
		sll.insert_At_First(1);

		/* Insert data at last index */
		sll.insert_At_Last(11);
		sll.insert_At_Last(13);

		/* To display SinglyLinkedList */
		System.out.println("Initial Singly-Linked-List");
		sll.display();
		System.out.println("Length of Singly-Linked-List Is:" + sll.length());

		/* To search the key */
		System.out.println(sll.search_data(16));
		
		sll.duplicate();
		System.out.println("Singly-Linked-List after removal of Duplicate elements");
		sll.display();

		/* To display Reverse SinglyLinkedList */
		ListNode reverseList = sll.reverse(head);
		System.out.println("Singly-Linked-List after Reversed");
		sll.display(reverseList);
		
	}
}
