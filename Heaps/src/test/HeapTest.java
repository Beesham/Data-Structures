package test;

import HeapADT.Element;
import HeapADT.Heap;

/**
 * Tests Heap methods
 * @author Beesham Sarendranauth
 */
public class HeapTest {
	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<Integer>();

		//Element e = new Element(2);
		heap.insert(2);
		heap.insert(7);
		heap.insert(1);

		System.out.println(heap.min());
		System.out.println(heap.size());
	}
}
