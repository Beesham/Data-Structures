package quickSort;

/**
 * In-place quick sort an array
 * @author Beesham Sarendranauth
 */
public class QuickSort {

	//Worst-case : O(n^2)
	//Best-case : O(n)
	public static void sort(int arr[], int a, int b) {
		if(a >= b) return;
		int pivot = arr[b];
		int l = a;
		int r = b - 1;

		while(l <= r) {
			while(l <= r && arr[l] <= pivot) {
				l = l + 1;
			}

			while(l <= r && arr[l] >= pivot) {
				r = r - 1;
			}

			if(l < r){
				swap(arr, l, r);
			}
		}
		swap(arr, l, b);
		sort(arr, a, l - 1);
		sort(arr, l + 1, b);
	}

	//O(1)
	private static void swap(int arr[], int indexK, int indexJ) {
		int temp = arr[indexK];
		arr[indexK] = arr[indexJ];
		arr[indexJ] = temp;
	}
}
