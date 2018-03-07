package HeapADT;

/**
 * HeapADT.Heap Data Structure
 * @author Beesham Sarendranauth
 */
public class Heap<E> implements HeapADT {

	private static final int INIT_SIZE_OF_ARR = 10;

	/*
		Keeps a count of the elements in the HeapADT.Heap
	 */
	private int size;

	/*
		Array of elements in the heap
	 */
	private E array[];

	public Heap() {
		array = (E[]) new Object[INIT_SIZE_OF_ARR];
		this.size = 0;
	}

	@Override
	public void insert(Object o) {
		//TODO

	}


	private void upHeap() {
		//TODO
	}

	@Override
	public Object removeMin() {
		//TODO
		return null;
	}

	private void downHeap() {
		//TODO
	}

	@Override
	public Object min() {
		//TODO
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		//TODO
		return false;
	}
}
