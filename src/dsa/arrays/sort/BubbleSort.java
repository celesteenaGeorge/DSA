package dsa.arrays.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = { 1, 4, 7, 8, 89, 567 };
		int endPoint = arr.length - 1;
		bubbleSort(arr, endPoint);//0(n^2)
		Arrays.stream(arr).forEach((a) -> System.out.println(a));
	}

	private static void bubbleSort(int[] arr, int endPoint) {

		int temp;
	    boolean swapped = false;
		if (endPoint == 0) {
			return;
		}
		for (int i = 0; i < endPoint; i++) {

			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				swapped = true;
	        }
	    }
	    // Stop early if no swaps
	    if (!swapped) return;
		endPoint--;
		bubbleSort(arr, endPoint);

	}

}
