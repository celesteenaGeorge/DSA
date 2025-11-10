package dsa.arrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {

		try (Scanner obj = new Scanner(System.in);) {
			System.out.println("Enter an integer");
			int key = obj.nextInt();
			int[] arr = { 1, 4, 7, 8, 89, 567 };

			int index = binarySearch(key, arr);
			if (index == -1) {
				System.out.println("Integer not found in the array");
			} else {
				System.out.println("The integer is at index " + index);
			}
		} catch (Exception e) {
			System.out.println("Invalid input" + e.getMessage());
		}
	}

	private static int binarySearch(int key, int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > key) {
				end = mid - 1;

			} else if (arr[mid] < key) {
				start = mid + 1;

			} else {
				return mid;
			}
		}
		return -1;
	}

}