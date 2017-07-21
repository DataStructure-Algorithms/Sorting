package com.heapdev.sorting;

/**
 * In-place algorithm, no extra memory required. Not Stable Algorithm. Time
 * complexity is O(N^2)
 * 
 * @author singh09.abhinav@gmail.com
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {27,2,28, 11, -7, 12, 4, 8, 1 };

		showArray(arr);
		quickSortAlgo(arr, 0, arr.length - 1);
		System.out.println();
		showArray(arr);
	}

	private static void quickSortAlgo(int[] arr, int low, int high) {

		if (low >= high)
			return;
		
		int pivot = partition(arr, low, high);
		quickSortAlgo(arr, low, pivot - 1);
		quickSortAlgo(arr, pivot + 1, high);

	}

	private static int partition(int[] arr, int low, int high) {

		int pivotIndex = low + (high - low) / 2;
		int i = low;
		swap(arr, pivotIndex, high);

		for (int j = low; j < high; j++) {
			if (arr[j] <= arr[high]) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, high);

		return i;
	}

	private static void swap(int[] arr, int i, int high) {
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
	}

	private static void showArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
