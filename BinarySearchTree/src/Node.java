/**
 * @author Beesham Sarendranauth
 * @param <E>
 */
public class Node<E> {
	private E o;
	private Node next;
	private Node previous;

	public Node(E o) {
		this.o = o;
	}

	public E getO() {
		return o;
	}

	public void setO(E o) {
		this.o = o;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
