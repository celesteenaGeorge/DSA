package dsa.arrays.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 8, 4, 5, 9, 2, 7, 0 };
		divideArray(arr);
		//Arrays.stream(arr).forEach((p) -> System.out.println(p));
	}

	private static void divideArray(int[] arr) {//on
		
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[arr.length - mid];
		
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = arr[i];
		}
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = arr[mid + i];
		}
		divideArray(leftArray);
		int i =0;
		divideArray(rightArray);
		 i =9;
		System.out.println(i);
		mergeSort(leftArray, rightArray, arr);

	}

	public static void mergeSort(int[] leftArray, int[] rightArray, int[] arr) {//

		int i = 0, j = 0, k = 0;

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < leftArray.length) {
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		while (j < rightArray.length) {
			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}

}
