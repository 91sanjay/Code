package com.sanjay.linkedlists;

public class NthToLastElement {

	public Node nthToLast(Node head, int k) {
		Node current = head;
		Node runner = head;
		Integer i = 0;
		
		while (i<k) {
			runner = runner.next;
			i++;
		}
		
		if (runner == null)
			return null;
		
		while (runner != null) {
			current = current.next;
			runner = runner.next;
		}
		
		return current;
	}
	
}
