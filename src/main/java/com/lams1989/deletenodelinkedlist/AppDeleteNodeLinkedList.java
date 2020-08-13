package com.lams1989.deletenodelinkedlist;

public class AppDeleteNodeLinkedList {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };
		int position = 2;

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		deleteNode(llist.head, position);
		printLinkedList(llist.head);
	}

	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

		if (head == null) {
			return null;
		} else if (position == 0) {
			return head.next;
		} else {
			SinglyLinkedListNode actual = head;
			for (int i = 0; i < position - 1; i++) {
				actual = actual.next;
			}
			actual.next = actual.next.next;
			return head;
		}

	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
