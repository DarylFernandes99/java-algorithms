package main.java.Algorithms;

public class CustomLinkedList {
	Node head;
	
	public void displayContents() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void deleteBackHalf() {
		if (head == null || head.next == null) {
			head = null;
		}
		
		Node slow = head;
		Node fast = head;
		Node prev = null;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = null;
	}
	
	public void deleteKthNodeFromEnd(int k) {
		if (head == null || k == 0) {
			return;
		}
		Node first = head;
		Node second = head;
		for (int i=0; i<k; i++) {
			if (second.next != null) {				
				System.out.println(second.data);
			}
			second = second.next;
			if (second.next == null) {
				if (i == k-1) {
					head = head.next;
				}
				return;
			}
		}
		
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}
		first.next = first.next.next;
	}
}