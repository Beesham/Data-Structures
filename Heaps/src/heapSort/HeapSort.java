package heapSort;

import heapADT.Heap;

/**
 * Heap sort algorithm
 * @author Beesham Sarendranauth
 */
public class HeapSort {

	public static int[] sort(int array[], int sizeOfArray) {

		//Construct heap
		Heap<Integer> heap = new Heap<>();

		//Build heap from sequence
		for(int i = 0; i < sizeOfArray; i++) {
			heap.insert(array[i]);
		}

		//remove root of heap as that will be the min num in the sequence
		for(int i = 0; i < sizeOfArray; i++) {
			array[i] = (int) heap.removeMin();
		}

		return array;
	}

}
