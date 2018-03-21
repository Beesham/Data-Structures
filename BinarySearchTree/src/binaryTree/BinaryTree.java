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
		if(n == null) return null;

		//if(((Comparable) o).compareTo(n.getO())) {

		//}

		return null;
	}

	@Override
	public Object find(Comparable o) {
		//TODO
		return null;
	}

	@Override
	public void insert(Comparable o) {
		//TODO
		Node n = new Node(o);
		n.setLeft(null);
		n.setRight(null);


	}

	private void insertItem(Comparable o, Node n) {

	}

	private void insertAtExternal(Comparable o, Node n) {

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
