package test;

import insertionSort.InsertionSort;

public class InsertionSortTest {
	public static void main(String[] args) {
		int arr[] = {2,5,78,9,3,87,4};

		for (int i = 0; i < arr.length; i++) {
			int i1 = arr[i];
			System.out.print(i1 + " ");
		}
		System.out.println("");
		InsertionSort.sort(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			int i1 = arr[i];
			System.out.print(i1 + " ");
		}
	}

}
