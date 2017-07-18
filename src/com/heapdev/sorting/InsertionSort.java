package com.heapdev.sorting;

/**
 * This is better sorting algorithm than Bubble Sort and Selection Sort. Still
 * it has Time Complexity of O(N^2). It is Adaptive algorithm, In-place
 * Algorithm that means it doesn't require any extra memory for sorting. It is
 * an Online algorithm : - It can sort the array as it receives data online. eg:
 * Sorting while downloading file.
 * 
 * Insertion sort requires more write and it can be issue when writing data is
 * an expensive operation.
 * 
 * @author singh09.abhinav@gmail.com
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 11, -7, 12, 4, 8, 1 };

		showArray(arr);
		selectionSortAlgo(arr);
		System.out.println();
		showArray(arr);

	}

	private static void selectionSortAlgo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int hole = i;
			while (hole > 0 && arr[hole - 1] > arr[hole]) {
				swap(arr, hole, hole - 1);
				hole--;
			}
		}
	}

	private static void swap(int[] arr, int hole, int i) {
		int temp = arr[hole];
		arr[hole] = arr[hole - 1];
		arr[hole - 1] = temp;

	}

	private static void showArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
