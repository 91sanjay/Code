package com.sanjay.util;

import java.util.ArrayList;
import java.util.List;

import com.sanjay.linkedlists.Node;

public class Build {
	Node node1 = new Node(2);
	Node node2 = new Node(3);
	Node node3 = new Node(4);
	Node node4 = new Node(4);
	Node node5 = new Node(3);
	Node node6 = new Node(2);

	public List<Node> getList() {
		List<Node> linkedList = new ArrayList<Node>();

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		linkedList.add(node1);
		linkedList.add(node2);
		linkedList.add(node3);
		linkedList.add(node4);
		linkedList.add(node5);
		linkedList.add(node6);

		return linkedList;
	}
	
	public List<Node> getCircluarList() {
		List<Node> linkedList = new ArrayList<Node>();

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
//		node5.next = node6;
//		node6.next = node1;

		linkedList.add(node1);
		linkedList.add(node2);
		linkedList.add(node3);
		linkedList.add(node4);
		linkedList.add(node5);
//		linkedList.add(node6);

		return linkedList;
	}

}
