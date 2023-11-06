package main.java.Algorithms;

import java.util.*;

public class QueueStackAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Basic queue
	public static void basicQueue() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(2);
		queue.add(3);
		queue.add(19);
		queue.add(20);
		
		int removedItem = queue.remove();
		System.out.println(removedItem);
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}
	
	// Print n binary numbers using queue
	public static void printBinary(int n) {
		if (n <= 0) {
			System.out.println();
			return ;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		
		for (int i=0; i<n; i++) {
			int current = queue.remove();
			System.out.println(current);
			
			queue.add(current * 10);
			queue.add(current * 10 + 1);
		}
		System.out.println();
	}
	
	// Basic stack
	public static void basicStack() {
		Stack<String> stack = new Stack<>();
		
		System.out.println("Pushed -> " + stack.push("main"));
		System.out.println("Pushed -> " + stack.push("builder"));
		System.out.println("Pushed -> " + stack.push("external-service"));
		System.out.println("Removed -> " + stack.pop());
		System.out.println("Pushed -> " + stack.push("parse-external-service"));
		System.out.println("Removed -> " + stack.pop());
		System.out.println("Removed -> " + stack.pop());
		System.out.println("Removed -> " + stack.pop());
	}
	
	// Finding next largest number
	public static void getNextLargestNumber(int[] arr) {
		if (arr.length == 0) {
			System.out.println();
			return;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		
		for (int i=1; i<arr.length; i++) {
			int next = arr[i];
			if (!stack.isEmpty()) {
				int popped = stack.pop();
				while (popped < next) {
					System.out.println(popped + " -> " + next);
					if (stack.isEmpty()) {
						break;
					}
					popped = stack.pop();
				}
				if (popped > next) {
					stack.push(popped);
				}
			}
			stack.push(next);
		}
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " -> -1");
		}
	}
	
	// Check for matching parentheses
	public static Boolean hasMatchingParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i<s.length(); i++) {
			char current = s.charAt(i);
			if (current == '(') {
				stack.push(current);
			} else if (current == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addHeader("Queue");
		basicQueue();
		
		addHeader("Print n binary numbers");
		printBinary(3);
		printBinary(-5);
		printBinary(0);
		printBinary(2);
		printBinary(9);
		
		addHeader("Basic stack");
		basicStack();
		
		addHeader("Get next largest number");
		getNextLargestNumber(new int[]{16, 7, 2, 15});
		
		addHeader("Check for matching parentheses");
		System.out.println(hasMatchingParentheses("((algorithms()))"));
		System.out.println(hasMatchingParentheses("()(algorithms())"));
		System.out.println(hasMatchingParentheses("((algorithms))"));
		System.out.println(hasMatchingParentheses("(algorithms)"));
		System.out.println(hasMatchingParentheses(")algorithms("));
	}

}
