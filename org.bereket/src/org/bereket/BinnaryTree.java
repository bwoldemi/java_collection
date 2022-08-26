package org.bereket;

public class BinnaryTree {
	Node root;
	class Node {
		Node leftChild;
		Node rightChild;
		int key;
		String value;
		
		Node (int key, String value ){
			this.key = key;
			this.value= value;
		}
	}
	/**
	 * Find the node that the value going to be added 
	 * @param node
	 * @return
	 */
	private Node  addRecursive(Node currentNode, int key, String value) {
		if(currentNode==null) {
			System.out.println("value: " + key);
			return new Node(key, value);
		}
		
		
		
		if(currentNode.key > key) {
			currentNode = addRecursive(currentNode.leftChild, key, value);
		}else if(currentNode.key < key) {
			currentNode = addRecursive(currentNode.rightChild, key, value);
		}else  {
			return currentNode;
		}
		
		//currentNode= new Node(key, value)
		return currentNode;
	}
	public void addValues(int key, String value) {
		//Node currentNode = addRecursive(root, key);
		root = addRecursive(root, key, value);
	}
	
	public void inOrder(Node node) {
		if(node!= null) {
			
			inOrder(node.leftChild);
			System.out.print(node.key);
			inOrder(node.rightChild);
			//System.out.print(node.key);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinnaryTree tree = new BinnaryTree();
		tree.addValues(45, "one");
		tree.addValues(2, "two");
		tree.addValues(6, "six");
		tree.addValues(4, "four");
		tree.addValues(11, "eleven");
		tree.addValues(100, "ten");
		tree.inOrder(tree.root);
		
	}

}
