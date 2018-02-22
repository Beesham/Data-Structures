package insertionSort;

public class InsertionSort {

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
