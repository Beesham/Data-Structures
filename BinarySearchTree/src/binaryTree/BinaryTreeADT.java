package binaryTree;

/**
 * @author Beesham Sarendranauth
 * @param <E>
 */
public interface BinaryTreeADT<E> {
	Object search (E o);
	Object find (E o);
	void insert (E o, Node n);
	Object remove (E o);
}
