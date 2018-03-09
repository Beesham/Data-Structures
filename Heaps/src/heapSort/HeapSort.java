package heapSort;

import heapADT.Heap;

/**
 * Heap sort algorithm
 * @author Beesham Sarendranauth
 */
public class HeapSort {

	public static void sort(int array[], int sizeOfArray) {
		Heap<Integer> heap = new Heap<>();

		for(int i = 0; i < sizeOfArray; i++) {
			heap.insert(array[i]);
		}
		for(int i = 0; i < sizeOfArray; i++) {
			array[i] = (int) heap.removeMin();
		}

		for(int i = 0; i < sizeOfArray; i++) {
			System.out.println(array[i]);
		}

	}

}
