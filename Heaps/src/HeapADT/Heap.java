package heapADT;

/**
 * heapADT.Heap Data Structure
 * @author Beesham Sarendranauth
 */
public class Heap<E> implements HeapADT {

	private static final int INIT_SIZE_OF_ARR = 1000001;

	/*
		Keeps a count of the elements in the heapADT.Heap
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
		//position of the minimum value in heap
		int minPosition = 1;

		//position of the last element in the heap
		int lastNodeInHeap = size;

		//get the minimum element in the heap
		E o = (E) min();

		//remove the minimum element from the heap and restore order
		swap(minPosition, lastNodeInHeap);
		array[lastNodeInHeap] = null;
		size--;
		downHeap(minPosition);

		return o;
	}

	private void downHeap(int parentPosition) {
		//left child position of a parent node position
		int leftChild = 2 * parentPosition;

		//right child position of the parent node position
		int rightChild = (2 * parentPosition) + 1;

		//restore order to heap by downheaping
		if(array[leftChild] != null) {
			if (((Comparable) array[parentPosition]).compareTo(array[leftChild]) > 0) {
				swap(parentPosition, leftChild);
				downHeap(leftChild);
				return;
			}
		}
		if(array[rightChild] != null) {
			if ((((Comparable) array[parentPosition]).compareTo(array[rightChild])) > 0) {
				swap(parentPosition, rightChild);
				downHeap(rightChild);
				return;
			}
		}
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
		return size() == 0;
	}
}
