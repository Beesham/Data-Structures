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
		Node<E> n = searchItem(o, head);
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
		return search(o);
	}

	@Override
	public void insert(Comparable o) {
		insertItem(o, head);
	}

	private Node insertItem(Comparable o, Node n) {
		//searches for an insertion point in the tree
		Node insertionPoint = searchItem(o, n);

		//Inserts the value at the found insertion point
		if(insertionPoint.getO() == null) return insertAtExternal(o, insertionPoint);
		if(insertionPoint.getO().compareTo(o) == 0) return insertItem(o, n.getLeft());
		return insertionPoint;
	}

	private Node insertAtExternal(Comparable o, Node insertionPoint) {
		//set the external node to new value
		insertionPoint.setO(o);

		//Creates blank external nodes
		Node left = new Node(null);
		Node right = new Node(null);

		//set the external nodes' parents to the inserted node
		left.setParent(insertionPoint);
		right.setParent(insertionPoint);

		//set the left and right children of the newly inserted node to blank external nodes
		insertionPoint.setLeft(left);
		insertionPoint.setRight(right);

		return insertionPoint;
	}

	@Override
	public Object remove(Comparable o) {
		Node n = searchItem(o, head);
		if(n.getO() == null) return null;
		return deleteNode(n).getO();
	}

	//Auxiliary method to remove
	private Node deleteNode(Node n) {
		Node tmp = null;
		try {
			tmp = n.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		if(n.getLeft().getO() == null && n.getRight().getO() == null) {
			n.setO(null);
			n.setRight(null);
			n.setLeft(null);
		}else if(n.getLeft().getO() != null && n.getRight().getO() == null){
			n.setO(n.getLeft().getO());
			n.setLeft(n.getLeft().getLeft());
			n.setRight(n.getLeft().getRight());
		}else if(n.getLeft().getO() != null && n.getRight().getO() == null){
			n.setO(n.getLeft().getO());
			n.setLeft(n.getLeft().getLeft());
			n.setRight(n.getLeft().getRight());
		}else{
			Node newNode = findLeftMostNode(n.getRight());
			Node newRight = deleteLeftMostNode(n.getRight());
			n.setO(newNode.getO());
			n.setRight(newRight);
		}
		return tmp;
	}

	//Auxiliary method to remove
	private Node findLeftMostNode(Node n){
		if(n.getO() == null) return n.getParent();
		return findLeftMostNode(n.getLeft());
	}

	private Node deleteLeftMostNode(Node n){
		if(n.getLeft().getO() == null) return n.getRight();
		else{
			Node newChild = deleteLeftMostNode(n.getLeft());
			n.setLeft(newChild);
			return n;
		}
	}

	public void inOrderTraversal() {inOrderTraversal(head);}

	private void inOrderTraversal(Node root) {
		if(root.getLeft().getO() == null && root.getRight().getO() == null){
			System.out.print(root.getO() + " ");
			return;
		}else if(root.getLeft().getO() != null) {
			inOrderTraversal(root.getLeft());
			System.out.print(root.getO() + " ");
			inOrderTraversal(root.getRight());
			return;
		}
	}

}
