package binaryTree;

/**
 * @author Beesham Sarendranauth
 * BinaruyTree Search implementation
 */
public class BinaryTree<E extends Comparable> implements BinaryTreeADT{

	/*
		Head of the tree
	 */
	Node head;

	public BinaryTree() {
		head = new Node(null);
	}

	@Override
	public Object search(Comparable o) {
		//TODO
		Node<E> n = searchItem(o, head);
		if(n == null) return null;
		return n.getO();
	}

	private Node searchItem(Comparable o, Node n) {
		//Base case
		if(n.getO() == null) return n;

		if(o.compareTo(n.getO()) < 0) { //If object < current object
			return searchItem(o, n.getLeft());
		}else if(o.compareTo(n.getO()) > 0){ //If object > current object
			return searchItem(o, n.getRight());
		}else
			return n;
	}

	@Override
	public Object find(Comparable o) {
		//TODO
		return null;
	}

	@Override
	public void insert(Comparable o) {
		//TODO
		insertItem(o, head);
	}

	private Node insertItem(Comparable o, Node n) {
		Node insertionPoint = searchItem(o, n);
		if(insertionPoint.getO() == null) {
			return insertAtExternal(o, insertionPoint);
		}
		if(insertionPoint.getO().compareTo(o) == 0) return insertItem(o, n.getLeft());
		return insertionPoint;
	}

	private Node insertAtExternal(Comparable o, Node insertionPoint) {
		insertionPoint.setO(o);
		Node left = new Node(null);
		Node right = new Node(null);

		left.setParent(insertionPoint);
		right.setParent(insertionPoint);

		insertionPoint.setLeft(left);
		insertionPoint.setRight(right);

		if(head.getO() == null) {
			head = insertionPoint;
		}

		return insertionPoint;
	}

	@Override
	public Object remove(Comparable o) {
		//TODO
		return null;
	}

	//Auxiliary method to remove
	private Node deleteNode(Node n) {
		//TODO
		return null;
	}

	//Auxiliary method to remove
	private Node findLeftMostNode(Node n){
		//TODO
		return null;
	}

	private Node deleteLeftMostNode(Node n){
		//TODO
		return null;
	}

}
