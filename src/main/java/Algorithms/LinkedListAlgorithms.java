package main.java.Algorithms;

import java.util.*;

public class LinkedListAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Basics
	public static void linkedListInbuilt() {
		LinkedList<String> result = new LinkedList<String>();
		result.add("Sally");
		result.add("Becky");
		result.add("Nick");
		result.add("Jack");
		result.add("Rachel");
		
		System.out.println(result.contains("Becky"));
		System.out.println(result.size());
		
		result.removeFirst();
		result.forEach(ele -> System.out.print(ele + " -> "));
	}
	
	// Custom Linked List
	public static void customLinkedList() {
		CustomLinkedList linkedList = new CustomLinkedList();
		
		Node firstNode = new Node(3);
		Node secondNode = new Node(4);
		Node thirdNode = new Node(5);
		Node fourthNode = new Node(6);
		
		linkedList.head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		
		linkedList.displayContents();
		
//		linkedList.deleteBackHalf();
//		linkedList.displayContents();
		
		linkedList.deleteKthNodeFromEnd(2);
		linkedList.displayContents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addHeader("Linked List basics");
		linkedListInbuilt();
		System.out.println();
		
		addHeader("Custom Linked List");
		customLinkedList();
	}

}
