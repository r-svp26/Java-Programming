package com.binarytree.ds;

public class BinarySearchTree {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		root = insert(root, value);

	}
	
	/* Search Key Element into Binary Search Tree */
	
	public  TreeNode search(int key){
		return search(root,key);
	}
	
	public TreeNode search(TreeNode root, int key){
		if(root==null || root.data==key){
			return root;
		}
		
		if(key<root.data){
			return search(root.left, key);
		}else{
			return search(root.right,key);
		}
		
	}
	
	

	/* Insert Data into Binary Search Tree */
	public TreeNode insert(TreeNode root, int value) {

		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data)
			root.left = insert(root.left, value);
		else
			root.right = insert(root.right, value);

		return root;
	}

	/* InOrder Traversal */
	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);

		System.out.print("Binary Search Tree Data: ");
		bst.inOrder();
		
		System.out.println("");
		TreeNode rs= bst.search(6);
		if(rs!=null){
			System.out.println("Key found...");
		}else
			System.out.println("Key not found!");

	}
}
