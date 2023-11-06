package main.java.Algorithms;

public class BinarySearchTree {
	TreeNode root;
	
	public void insert(int value) {
		insert(this.root, value);
	}
	
	private TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode();
			root.data = value;
		} else if (value < root.data) {
			root.left = insert(root.left, value);
		} else if (value > root.data) {
			root.right = insert(root.right, value);			
		}
		return root;
	}
	
	public Boolean searchElement(int value) {
		if (root == null) {
			return false;
		}
		
		TreeNode head = root;
		
		while (head != null) {
			if (head.data == value) {
				return true;
			} else if (head.data < value) {
				head = head.right;
			} else if (head.data > value) {
				head = head.left;
			}
		}
		
		return false;
	}
}
