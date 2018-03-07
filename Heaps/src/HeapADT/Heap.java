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
		//increase the size of the heap
		size++;

		//the new element position is the new size
		int newElementPos = size;

		//set the new element to the last position of the array, i.e the last leaf node
		array[newElementPos] = (E) o;

		//restore order of heap
		upHeap(newElementPos);
	}


	private void upHeap(int childPosition) {
		//child parents' position in the array
		int parentPos = childPosition/2;

		//base case
		if(parentPos == 0) return;

		//compares the child and parents values to determine if order was violated
		if(((Comparable)array[childPosition]).compareTo(array[parentPos]) < 0) {
			swap(childPosition, parentPos);
			upHeap(parentPos);
		}
	}

	/*
		Swaps the position of the objects in an array
	 */
	private void swap(int p1, int p2) {
		E temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
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
		return array[1];
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
