package test;

import heapADT.Heap;

/**
 * Tests Heap methods
 * @author Beesham Sarendranauth
 */
public class HeapTest {
	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<Integer>();

		System.out.println("Expected: true, Actual: " + heap.isEmpty());

		heap.insert(2);
		heap.insert(7);
		heap.insert(1);

		System.out.println(heap.min());
		System.out.println(heap.size());
		System.out.println("Expected: false, Actual: " + heap.isEmpty());

		System.out.println("Expected: 1, Actual: " + heap.removeMin());
		System.out.println("Expected: 2, Actual: " + heap.removeMin());

	}
}
