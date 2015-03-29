package com.sanjay.linkedlists;

import java.util.HashSet;

public class RemoveDuplicates {

	public Node removeDuplicatesWithDs(Node head) {
		HashSet<Integer> data = new HashSet<Integer>();
		Node previous = null;
		Node current = head;

		while (current != null) {
			if (data.contains(current.data)) {
				previous.next = current.next;
				current = current.next;
			} else {
				data.add(current.data);
				previous = current;
				current = current.next;
			}
		}
		return head;
	}

	public Node removeDuplicates(Node head) {
		Node current = head;

		while (current != null) {
			Node runner = current;

			while (runner.next != null) {
				if (current.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
				current = current.next;
			}
		}
		return head;
	}
}
