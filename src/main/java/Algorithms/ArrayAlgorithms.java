package main.java.Algorithms;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Linear search
	public static Boolean linearSearch(int[] arr, int item) {
		for (int i: arr) {
			if (i == item) {
				return true;
			}
		}
		return false;
	}
	
	public static OptionalInt linearSearchOptimized(int[] arr, int item) {
		return Arrays.stream(arr).filter(ele -> ele == item).findFirst();
	}
	
	// Binary search
	/**
	 * Assuming array is sorted else would need to normalize the array which would add additional time complexity
	 * @param arr
	 * @param item
	 * @return
	 */
	public static Boolean binarySearch(int[] arr, int item) {
		int min = 0;
		int max = arr.length-1;

		while (min <= max) {
			int mid = (min + max)/2;
			
			if (arr[mid] == item) {
				return true;
			} else if (arr[mid] > item) {
				max = mid-1;
			} else {
				min = mid+1;
			}
		}
		
		return false;
	}
	
	// Aggregate and filter
	public static int[] findEvenNums(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i: arr) {
			if (i % 2 == 0) {				
				result.add(i);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static int[] findEvenNumsOptimized(int[] arr) {
		IntPredicate isEvenPred = num -> num%2 == 0;
		return Stream.of(arr)
				.flatMapToInt(Arrays::stream)
				.filter(isEvenPred)
				.toArray();
	}
	
	// Reverse
	public static int[] reverse(int[] arr) {
		int[] result = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			result[arr.length-i-1] = arr[i];
		}
		
		return result;
	}
	
	public static int[] reverseOptimized(int[] arr) {
		
		for (int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		return arr;
	}
	
	// Rotate
	public static int[] rotateArrayLeft(int[] arr) {
		int temp = arr[0];
		for (int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		return arr;
	}
	
	public static int[] rotateArrayRight(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6};
		addHeader("Linear search");
		System.out.println(linearSearch(arr, 1));
		System.out.println(linearSearch(arr, 8));
		addSubHeader("Optimized");
		linearSearchOptimized(arr, 1).ifPresent(System.out::println);;
		linearSearchOptimized(arr, 8).ifPresent(System.out::println);
		
		addHeader("Binary Search");
		System.out.println(binarySearch(arr, 1));
		System.out.println(binarySearch(arr, 5));
		System.out.println(binarySearch(arr, 6));
		System.out.println(binarySearch(arr, 7));
		addSubHeader("Inbuilt method");
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 7));
		
		addHeader("Filter even numbers");
		Arrays.stream(findEvenNums(arr)).forEach(System.out::println);
		addSubHeader("Optimized");
		Arrays.stream(findEvenNumsOptimized(arr)).forEach(System.out::println);
		
		addHeader("Reverse");
		Arrays.stream(reverse(arr)).forEach(System.out::println);
		addSubHeader("Optimized");
		Arrays.stream(reverseOptimized(arr)).forEach(System.out::println);
		
		addHeader("Rotate array");
		reverseOptimized(arr);
		addSubHeader("Left shift");
		Arrays.stream(rotateArrayLeft(arr)).forEach(System.out::println);
		addSubHeader("Right shift");
		Arrays.stream(rotateArrayRight(arr)).forEach(System.out::println);
	}

}