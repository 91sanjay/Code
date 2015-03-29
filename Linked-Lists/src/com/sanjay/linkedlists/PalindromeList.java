package com.sanjay.linkedlists;

public class PalindromeList {
	public Boolean isPalindrome (Node head) {
		Boolean isPalindrome = true;
		Node startPtr = head;
		Node runner = head;
		Node endPtr = null;
		
		while (startPtr != endPtr && startPtr.next !=endPtr) {
			while (runner.next != endPtr) {
				runner = runner.next;
			}
			endPtr = runner;
			
			if (startPtr.data != endPtr.data) {
				isPalindrome = false;
				break;
			}
			startPtr = startPtr.next;
			runner = startPtr;
			
		}
		
		return isPalindrome;
	}
}
