package main.java.Algorithms;

import java.util.*;

public class HashAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Basic Hasmhap
	public static void basicHashmap() {
		Employee emp1 = new Employee("Roby", 3827, "Technology");
		Employee emp2 = new Employee("Bobby", 8247, "Marketing");
		Employee emp3 = new Employee("Sally", 4562, "Sales");
		
		HashMap<Integer, Employee> employeesById = new HashMap<>();
		employeesById.put(emp1.id, emp1);
		employeesById.put(emp2.id, emp2);
		employeesById.put(emp3.id, emp3);
		
		Employee retrievedEmployee = (employeesById.get(4562));
		if (retrievedEmployee != null) {
			System.out.println(retrievedEmployee.name + " -> " + retrievedEmployee.department);
		}
		
		HashSet<String> productCodes = new HashSet<>();
		productCodes.add("2T26B");
		productCodes.add("9K42P");
		productCodes.add("H53781");
		
		System.out.println(productCodes.contains("9K42P"));
		System.out.println(productCodes.contains("9KP"));
	}
	
	// Find missing elements
	public static List<Integer> findMissingElements(int[] arr1, int[] arr2) {
		List<Integer> missingElements = new ArrayList<Integer>();
		HashSet<Integer> arr2Elements = new HashSet<>();
		for (int i: arr2) {
			arr2Elements.add(i);
		}
		for (int x: arr1) {
			if (!arr2Elements.contains(x)) {
				missingElements.add(x);
			}
		}
		return missingElements;
	}
	
	// Display count of each element in an array
	public static void countElements(int[] arr) {
		HashMap<Integer, Integer> occurenceCount = new HashMap<>();
		
		for (int i: arr) {
			if (occurenceCount.containsKey(i)) {
				occurenceCount.put(i, occurenceCount.get(i) + 1);
			} else {
				occurenceCount.put(i, 1);
			}
		}
		
		occurenceCount.forEach((key, value) -> System.out.println(key + " -> " + value));
	}
	
	// Check if cycle exists in linked list
	public static void checkCycle() {
		CustomLinkedList customLinkedList = new CustomLinkedList();
		Node firstNode = new Node(3);
		Node secondNode = new Node(4);
		Node thirdNode = new Node(5);
		Node fourthNode = new Node(6);
		
		customLinkedList.head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		System.out.println(customLinkedList.hasCycle());
		
		CustomLinkedList cycleLinkedList = new CustomLinkedList();
		cycleLinkedList.head = firstNode;
		thirdNode.next = secondNode;
		System.out.println(cycleLinkedList.hasCycle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addHeader("Basic hashmap");
		basicHashmap();
		
		addHeader("Find missing elements");
		findMissingElements(new int[]{1,2,3,4}, new int[]{1,3}).forEach(System.out::print);
		System.out.println();
		findMissingElements(new int[]{8,0,1,7,3}, new int[]{5,7,8,0,2}).forEach(System.out::print);
		
		addHeader("Check counr of each element in array");
		countElements(new int[]{1, 3, 2, 2, 1});
		
		addHeader("Check if cycle exists in linked list");
		checkCycle();
	}

}
