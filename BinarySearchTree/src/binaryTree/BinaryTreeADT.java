package binaryTree;

/**
 * @author Beesham Sarendranauth
 * @param <E>
 */
public interface BinaryTreeADT<E extends Comparable> {
	Object search (E o);
	Object find (E o);
	void insert (E o);
	Object remove (E o);
	void clear();
}
