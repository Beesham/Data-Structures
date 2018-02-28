/**
 * Heap abstract data type
 * @author Beesham Sarendranauth
 */
public interface HeapADT<E> {
	void insert(E o);
	void removeMin(E o);
	Object min();
	int size();
	boolean isEmpty();
}
