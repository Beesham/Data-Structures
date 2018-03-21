package binaryTree;

/**
 * @author Beesham Sarendranauth
 * @param <E>
 */
public class Node<E extends Comparable> {
	private E o;
	private Node left;
	private Node right;

	public Node(E o) {
		this.o = o;
		left = null;
		right = null;
	}

	public E getO() {
		return o;
	}

	public void setO(E o) {
		this.o = o;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
