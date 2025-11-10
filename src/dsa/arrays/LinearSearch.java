package dsa.arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {

		try (Scanner obj = new Scanner(System.in);) {

			System.out.println("Enter an interger  ");
			int key = obj.nextInt();
			int[] arr = { 1, 2, 3, 45, 5, 57, 9 };
			int index = linearSearch(key, arr);
			if (index == -1) {
				System.out.println("The integer was not found in the array ");
			} else {
				System.out.println("The integer is at index " + index);
			}
		}
		catch (Exception e) {
			System.out.println("invalid data entered " + e.getMessage());
		}
	}

	private static int linearSearch(int key, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;

	}

}
