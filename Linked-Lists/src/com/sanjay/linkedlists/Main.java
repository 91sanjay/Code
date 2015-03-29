package com.sanjay.linkedlists;

import java.util.List;

import com.sanjay.util.Build;

public class Main {

	public static void main(String[] args) {
		/* Main function for Removing duplicates in an unsorted Linked List */
		/**/
		
		Integer size = 0;
		Build b = new Build();
		
		List<Node> linkedList = b.getList();

		System.out.println("Intial List");
		System.out.println("List size = " + linkedList.size());

		for (Node node : linkedList) {
			System.out.println(node.data);
		}

		/*---------------------------------REMOVE DUPLICATES WITH DS---------------------------------------*/
//		/* With Data structure */
//		System.out.println("Remove Duplicates");
//		RemoveDuplicates rm = new RemoveDuplicates();
		
//		Node head = rm.removeDuplicatesWithDs(linkedList.get(0));
//
//		while (head != null) {
//			System.out.println(head.data);
//			size++;
//			head = head.next;
//		}
//
//		System.out.println("List size after deletion = " + size);
		
		/*-------------------------------REMOVE DUPLICATES WITHOUT DS-----------------------------------------*/
		
		/* Without Data structure */
//		System.out.println("Remove Duplicates");
//
//		RemoveDuplicates rm = new RemoveDuplicates();
//		Node headAfter = rm.removeDuplicatesWithDs(linkedList.get(0));
//
//		while (headAfter != null) {
//			System.out.println(headAfter.data);
//			size++;
//			headAfter = headAfter.next;
//		}
//
//		System.out.println("List size after deletion = " + size);
		
		/*----------------------------------NTH TO LAST ELEMENT--------------------------------------*/
		
//		System.out.println("Nth to last element");
//	
//		NthToLastElement nl = new NthToLastElement();
//		Node head = nl.nthToLast(linkedList.get(0),4);
//		
//		if(head != null)
//			System.out.println(head.data+" is "+4+"th to last element");
		
		/*---------------------------PARTITION---------------------------------------------*/
		
//		Partition p = new Partition();
//		Node head = p.partition(linkedList.get(0), 7);
//		
//		System.out.println("Partition");
//		while (head != null) {
//			System.out.println(head.data);
//			size++;
//			head = head.next;
//		}	
		
		/*-------------------------------SUM OF TWO LISTS--------------------------------------------------------------*/
		
//		Sum s = new Sum();
//		
//		Node head = s.sumOfLists(linkedList.get(0), linkedList.get(0));
//		
//		System.out.println("Sum");
//		while (head != null) {
//			System.out.println(head.data);
//			size++;
//			head = head.next;
//		}
		
		/*--------------------------------CIRCULAR LINKED LIST-------------------------------------------------------*/
		
//		CircularLinkedList cl = new CircularLinkedList();
//		List<Node> list = b.getCircluarList();
//		
//		Boolean isCircular = cl.isCircular(list.get(0));
//		
//		System.out.println(isCircular);
		
		/*----------------------------------------------------------------------------------------*/
		
		PalindromeList pl = new PalindromeList();
		
		Boolean isPalindrome = pl.isPalindrome(linkedList.get(0));
		
		System.out.println(isPalindrome);
	}
}
