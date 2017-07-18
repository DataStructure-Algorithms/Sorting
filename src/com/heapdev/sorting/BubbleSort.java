package com.heapdev.sorting;

/**
 * 
 * Bubbe sort is very impractical in use. The Time complexity is O(N^2). But
 * this is in-place sorting algorithm. No extra space is required.
 * 
 * @author singh09.abhinav@gmail.com
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 11, -7, 12, 4, 8, 1 };

		showArray(nums);
		bubbleSort(nums);
		System.out.println();
		showArray(nums);

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void showArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}