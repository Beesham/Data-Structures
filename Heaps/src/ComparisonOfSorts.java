import heapSort.HeapSort;
import insertionSort.InsertionSort;
import quickSort.QuickSort;

import java.util.Random;
import java.util.Scanner;

/**
 * Compares the sorting times of inplacequick sort and inplace insertion sort
 * @author Beesham Sarendranauth
 */
public class ComparisonOfSorts {
	public static void main(String[] args) {
		SortMe sortMe = new SortMe();

		//sortMe.genRandomNums();
		//sortMe.runInsertionSortOnArr();

		//sortMe.genRandomNums();
		//sortMe.runQuickSortOnArr();

		sortMe.genRandomNums();
		sortMe.runHeapSortOnArr();
	}

	private static class SortMe{
		int a1[] = new int[10];
		int a2[] = new int[100];
		int a3[] = new int[1000];
		int a4[] = new int[10000];
		int a5[] = new int[100000];
		int a6[] = new int[1000000];

		public SortMe() {
		}

		public void genRandomNums() {
			randomize(a1);
			randomize(a2);
			randomize(a3);
			randomize(a4);
			randomize(a5);
			randomize(a6);
		}

		private void randomize(int arr[]) {
			Random rand = new Random(100);
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*100 + 1);
			}
		}

		public void runInsertionSortOnArr() {
			Scanner in = new Scanner(System.in);
			System.out.print("Run InPlace Insertion Sort on a1?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a1, a1.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Insertion Sort on a2?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a2, a2.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Insertion Sort on a3");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a3, a3.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Insertion Sort on a4?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a4, a4.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Insertion Sort on a5?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a5, a5.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Insertion Sort on a6?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				InsertionSort.sort(a6, a6.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}
		}

		public void runQuickSortOnArr() {
			Scanner in = new Scanner(System.in);
			System.out.print("Run InPlace Quick Sort on a1?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a1, 0, a1.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Quick Sort on a2?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a2, 0, a2.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Quick Sort on a3");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a3, 0, a3.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Quick Sort on a4?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a4, 0, a4.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Quick Sort on a5?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a5, 0, a5.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun InPlace Quick Sort on a6?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				QuickSort.sort(a6, 0, a6.length - 1);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}
		}

		public void runHeapSortOnArr() {
			Scanner in = new Scanner(System.in);
			System.out.print("Run Heap Sort on a1?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a1, a1.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun Heap Sort on a2?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a2, a2.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun Heap Sort on a3");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a3, a3.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun Heap Sort on a4?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a4, a4.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun Heap Sort on a5?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a5, a5.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}

			System.out.print("\nRun Heap Sort on a6?");
			if(in.nextInt() == 1) {
				long startTime = System.nanoTime();
				HeapSort.sort(a6, a6.length);
				long endTime = System.nanoTime();
				System.out.println(endTime - startTime);
			}
		}
	}


}
