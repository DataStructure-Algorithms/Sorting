package com.heapdev.sorting;

/**
 * Better than Bubble Sort but still time complexity is O(N^2). In-place sorting
 * algorithm, means it doesn't require any extra space. It is not a stable
 * sorting algorithm, means, so similar elements may change position after
 * sorting.
 * 
 * @author singh.abhinav@gmail.com
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 11, -7, 12, 4, 8, 1 };
		showArray(arr);
		selectionSortAlgo(arr);
		System.out.println();
		showArray(arr);
	}

	private static void selectionSortAlgo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			/**
			 * This means if index which is now calculated from the loop is not the left
			 * most item then swap the leftmost item with index.
			 */
			if (index != i) {
				swap(arr, index, i);
			}
		}

	}

	private static void swap(int[] arr, int index, int j) {
		int temp = arr[index];
		arr[index] = arr[j];
		arr[j] = temp;
	}

	private static void showArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
