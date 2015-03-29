package com.sanjay.linkedlists;


public class Partition {
	public Node partition(Node head,int k) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		Node current = head;
		
		while (current != null) {
			Node node = current;
			current = current.next;
			node.next = null;
			
			if (node.data < k) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = beforeEnd.next;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = afterEnd.next;
				}
			}
		}
		
		if (beforeStart == null)
			return afterStart;
		
		beforeEnd.next = afterStart;
		
		return beforeStart;
	}
}
