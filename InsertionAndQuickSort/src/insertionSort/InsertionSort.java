package insertionSort;


/**
 * Insertion sort algorithm
 * @author Beesham Sarendranauth
 */
public class InsertionSort {

	//Worst-case :O(n^2)
	//Best-case :O(n^2), even if the list is sorted, the algo doesn't know
	// that and thus still looks for unsorted items below the index
	public static void sort(int arr[], int sizeOfArray) {
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = i - 1, k = i; j >= 0; j--, k--) {
				if (arr[k] < arr[j]) {
					swap(arr, k, j);
				}
			}
		}
	}

	//O(1)
	private static void swap(int arr[], int indexK, int indexJ) {
		int temp = arr[indexK];
		arr[indexK] = arr[indexJ];
		arr[indexJ] = temp;
	}
}
