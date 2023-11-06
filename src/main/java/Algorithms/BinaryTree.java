package main.java.Algorithms;

public class BinaryTree {
	TreeNode root;
	
	public void preOrderTraversal() {
		preOrderTraversal(this.root);
	}
	
	private void preOrderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(this.root);
	}
	
	private void inOrderTraversal(TreeNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal() {
		postOrderTraversal(this.root);
	}
	
	private void postOrderTraversal(TreeNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}
}
