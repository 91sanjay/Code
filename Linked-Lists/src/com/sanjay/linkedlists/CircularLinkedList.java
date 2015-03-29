package com.sanjay.linkedlists;

public class CircularLinkedList {
	public Boolean isCircular (Node head) {
		Boolean isCircular = false;
		Node slow = head;
		Node fast = head;
		
		while (slow != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				isCircular = true;
				break;
			}
		}
			
		return isCircular;
	}
}
