package com.sanjay.linkedlists;

public class Sum {
	public Node sumOfLists(Node list1, Node list2) {
		Node sumList = null;
		Node sumListHead = null;
		Integer len1 = 0;
		Integer len2 = 0;
		Integer carry = 0;
		Node list1End = list1;
		Node list2End = list2;

		while (list1End != null) {
			list1End = list1End.next;
			len1++;
		}

		while (list2End != null) {
			list2End = list2End.next;
			len2++;
		}

		if (len1 < len2) {
			Integer diff = len1 - len2;

			while (diff > 0) {
				Node node = new Node(0);
				list1End.next = node;
				list1End = list1End.next;
				diff--;
			}
		} else if (len2 < len1) {
			Integer diff = len2 - len1;

			while (diff > 0) {
				Node node = new Node(0);
				list2End.next = node;
				list2End = list2End.next;
				diff--;
			}
		} 
			
		while (list1 != null && list2 !=null) {
			Integer sum = list1.data + list2.data + carry;
			Integer digit = sum%10;
			carry = sum/10;
			
			Node node = new Node(digit);
			
			if (sumList == null) {
				sumList = node;
				sumListHead = node;
			} else {
				sumList.next = node;
				sumList = sumList.next;
			}
			list1 = list1.next;
			list2 = list2.next;
		}
		
		if (carry != 0) {
			sumList.data = (carry * 10) + sumList.data;
		}

		return sumListHead;
	}
}
