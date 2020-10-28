package com.binarytree.ds;

public class BinaryTree {
	private TreeNode root;

	public class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);

		root = first; // root -> 1
		first.left = second;
		first.right = third; /* second<--first-->third */
		second.left = fourth;
	}

	/* PreOrder Traversal */
	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	/* InOrder Traversal */
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	/* PostOrder Traversal */
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();

		System.out.print("Pre-Order Binary Tree Traversal: ");
		bt.preOrder(bt.root);

		System.out.print("\nIn-Order Binary Tree Traversal: ");
		bt.inOrder(bt.root);
		
		System.out.print("\nPost-Order Binary Tree Traversal: ");
		bt.postOrder(bt.root);
		
	}
}
