package bst;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	class Node {
		private Person value;
		private Node left, right;
	}

	public boolean insert(Person item) {
		Node n = new Node();
		n.value = item;
		n.left = null;
		n.right = null;
		if (root == null) {
			root = n;
			return true;
		}
		Node p = root;
		Node c = root;
		while (c != null) {
			p = c;
			if (item.getName().compareTo(c.value.getName()) < 0) {
				c = c.left;
			} else {
				c = c.right;
			}
		}
		if (item.getName().compareTo(c.value.getName()) < 0) {
			p.left = n;
		} else {
			p.right = n;
		}
		return true;
	}

	public Node findNode(String name) {
		Node c = root;
		while (c != null) {
			if (name.compareTo(c.value.getName()) == 0) {
				break;
			} else if (name.compareTo(c.value.getName()) < 0) {
				c = c.left;
			} else {
				c = c.right;
			}
		}
		return c;
	}
	
	public void printAll(Node n){
		if(n!=null){
			System.out.println("BinarySearchTree.printAll() value "+n.value);
			printAll(n.left);
			printAll(n.right);
		}
	}

}
