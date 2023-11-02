package main.java.Algorithms;

public class StringAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Find maximum value
	public static int findMaximum(int a, int b , int c) {
		
		if (a > b) {
			if (a > c || a == c) {
				return a;
			}
		}
		if (b > c) {
			return b;
		}
		return c;
	}
	
	public static int findMaximumOptimized(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		return max;
	}
	
	// Check if every character is uppercase/lowercase
	public static boolean isUpperCase(String s) {
		return s.chars().allMatch(Character::isUpperCase);
	}
	public static boolean isLowerCase(String s) {
		return s.chars().allMatch(Character::isLowerCase);
	}
	
	// Check complex password
	public static boolean isPasswordComplex(String s) {		
		return s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) && s.chars().anyMatch(Character::isDigit);
	}
	
	// Normalize string
	public static String normailizedString(String s) {
//		String lowerCased = s.toLowerCase();
//		String trimmed = lowerCased.trim();
//		String normalized = trimmed.replace(",", "");
//		
//		return lowerCased;
		return s.toLowerCase().trim().replace(",", "");
	}
	
	// Find substring
	public static Boolean findSubstringInbuilt(String s, String seq) {
		return s.contains(seq);
	}
	
	
	public static void parseContents(String s) {
		addSubHeader("Option 1");
		for (char c: s.toCharArray()) {
			System.out.print(c);
		}
		System.out.println("");
		addSubHeader("Option 2");
		for (int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}
	
	// Check if char at even index
	public static boolean isAtEvenIndex(String s, char item) {
		if (s == null || s.isEmpty()) {
			return false;
		}
		for (int i=0; i<s.length()/2 + 1; i+=2) {
			if (s.charAt(i) == item) {
				return true;
			}
		}
		return false;
	}
	
	// Reverse given string
	public static String reverse(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		
		StringBuilder reversed = new StringBuilder();
		for (int i=s.length()-1; i>=0; i--) {
			reversed.append(s.charAt(i));
		}
		
		return reversed.toString();
	}
	
	public static String revrseOptimized(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		
		StringBuilder reversed = new StringBuilder(s);
		return reversed.reverse().toString();
	}
	
	public static String reverseSentence(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		
		String result = "";
		for (String word: s.split(" ")) {
			result += " " + new StringBuilder(word).reverse().toString();
		}
		
		return result.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addHeader("Get maximum number");
		System.out.println(findMaximum(1, 2, 3));
		System.out.println(findMaximum(8, 8, 1));
		System.out.println(findMaximum(3, 2, 3));
		System.out.println(findMaximum(1, 1, 9));
		System.out.println(findMaximum(1, 9, 9));
		
		addSubHeader("Optimized");
		System.out.println(findMaximumOptimized(1, 2, 3));
		System.out.println(findMaximumOptimized(8, 8, 1));
		System.out.println(findMaximumOptimized(3, 2, 3));
		System.out.println(findMaximumOptimized(1, 1, 9));
		System.out.println(findMaximumOptimized(1, 9, 9));
		
		addHeader("Check if string is Uppercase/lowercase");
		System.out.println(isUpperCase("VDSVBDHVSB"));
		System.out.println(isUpperCase("HGbUYY"));
		System.out.println(isLowerCase("gysudvbd"));
		System.out.println(isLowerCase("gysuFvbd"));
		
		addHeader("Check complex password");
		System.out.println(isPasswordComplex("Hell0"));
		System.out.println(isPasswordComplex("Hello"));
		System.out.println(isPasswordComplex("hellO"));
		System.out.println(isPasswordComplex("heLLo"));
		System.out.println(isPasswordComplex("hello"));
		System.out.println(isPasswordComplex(""));

		addHeader("Normalize string");
		System.out.println(normailizedString("   Hello There, BUDDY  "));
		
		addHeader("Check if Substring exists");
		System.out.println(findSubstringInbuilt("heLLo", "LL"));

		addHeader("Print Content");
		parseContents("hello");
		
		addHeader("Check if char at even index");
		System.out.println(isAtEvenIndex("HeLLo", 'L'));
		System.out.println(isAtEvenIndex("HeLLo", 'T'));
		System.out.println(isAtEvenIndex("HeLLo", 'H'));
		System.out.println(isAtEvenIndex("", 'H'));
		System.out.println(isAtEvenIndex(null, 'H'));
		
		addHeader("Reverse string");
		System.out.println(reverse(null));
		System.out.println(reverse(""));
		System.out.println(reverse("hello"));
		addSubHeader("Optimized");
		System.out.println(revrseOptimized(null));
		System.out.println(revrseOptimized(""));
		System.out.println(revrseOptimized("hello"));
		addSubHeader("Reverse sentence");
		System.out.println(reverseSentence(null));
		System.out.println(reverseSentence(""));
		System.out.println(reverseSentence("sally is a great worker"));
		System.out.println(reverseSentence("racer racecar madam"));
		System.out.println(reverseSentence("what can I do today"));
	}

}