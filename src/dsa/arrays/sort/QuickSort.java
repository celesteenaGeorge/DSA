package dsa.arrays.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]) {
		int[] arr = { 1, 4, 7, 8, 89, 567, 98 };
		int high = arr.length - 1;
		int low = -1;
		quickSort(arr, low, high);
		Arrays.stream(arr).forEach((a) -> System.out.println(a));
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int finalpivot = partition(arr, low, high);
			quickSort(arr, low, (finalpivot - 1));
			quickSort(arr, (finalpivot + 1), high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int temp = 0;
		int finalpivot = 0;
		for (int j = low + 1; j < high; j++) {
			if (arr[j] < pivot) {
				low++;
				temp = arr[low];
				arr[low] = arr[j];
				arr[j] = temp;
			}
		}
		low++;
		temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		finalpivot = low;
		return finalpivot;
	}

}
