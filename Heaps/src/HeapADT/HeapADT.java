package heapADT;

/**
 * heapADT.Heap abstract data type
 * @author Beesham Sarendranauth
 */
public interface HeapADT<E> {
	void insert(E o);
	Object removeMin();
	Object min();
	int size();
	boolean isEmpty();
}
