package main.java.Algorithms;

public class TreeAlgorithms {

	public static void addHeader(String str) {
		System.out.println("-".repeat(10) + " " + str + " " + "-".repeat(10));
	}
	public static void addSubHeader(String str) {
		System.out.println("-".repeat(3) + " " + str + " " + "-".repeat(3));
	}
	
	// Binary tree
	public static void binaryTree() {
		TreeNode rootNode = new TreeNode();
		rootNode.data = 5;
		TreeNode twoNode = new TreeNode();
		twoNode.data = 2;
		TreeNode fourNode = new TreeNode();
		fourNode.data = 4;
		TreeNode nineNode = new TreeNode();
		nineNode.data = 9;
		TreeNode tenNode = new TreeNode();
		tenNode.data = 10;
		TreeNode sevenNode = new TreeNode();
		sevenNode.data = 7;
		
		rootNode.left = twoNode;
		rootNode.right = fourNode;
		twoNode.left = nineNode;
		twoNode.right = tenNode;
		fourNode.left = sevenNode;
		
//		BinarySearchTree searchTree = new BinarySearchTree();
//		searchTree.root = rootNode;
//		searchTree.insert(1);
//		searchTree.insert(3);
//		searchTree.insert(4);
		
		BinaryTree tree = new BinaryTree();
		tree.root = rootNode;
		
		tree.preOrderTraversal();
		System.out.println();
		
		tree.postOrderTraversal();
		System.out.println();
		
		tree.inOrderTraversal();
		System.out.println();
	}
	
	// Binary Search Tree
	public static void binarySearchTree() {
		TreeNode rootNode = new TreeNode();
		rootNode.data = 5;
		TreeNode twoNode = new TreeNode();
		twoNode.data = 2;
		TreeNode fourNode = new TreeNode();
		fourNode.data = 4;
		TreeNode nineNode = new TreeNode();
		nineNode.data = 9;
		TreeNode tenNode = new TreeNode();
		tenNode.data = 10;
		TreeNode sevenNode = new TreeNode();
		sevenNode.data = 7;
		
		rootNode.left = twoNode;
		rootNode.right = fourNode;
		twoNode.left = nineNode;
		twoNode.right = tenNode;
		fourNode.left = sevenNode;
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.root = rootNode;
		
		System.out.println(binarySearchTree.searchElement(2));
		System.out.println(binarySearchTree.searchElement(3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addHeader("Binary Tree");
		binaryTree();
		
		addHeader("Binary Search Tree");
		binarySearchTree();
	}

}
