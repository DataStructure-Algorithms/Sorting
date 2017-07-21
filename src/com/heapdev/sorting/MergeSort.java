package com.heapdev.sorting;

import java.util.Random;

/**
 * It is Stable, not an in-place sorting algorithm. Time complexity is O(N
 * logN). Comparison bases sorting.
 * 
 * @author singh09.abhinav@gmail.com
 *
 */

public class MergeSort {

	public static void main(String[] args) {

		Random random = new Random();
		int[] nums = new int[10];

		for (int j = 0; j < 10; j++) {
			nums[j] = random.nextInt(1000) - 500;
		}

		MergeSort mergeSort = new MergeSort(nums);
		mergeSort.mergeSort(0, nums.length - 1);
		mergeSort.showArray(nums);
	}

	private int[] num;
	private int[] tempArray;

	public MergeSort(int[] num) {
		this.num = num;
		this.tempArray = new int[num.length];
	}

	public void mergeSort(int low, int high) {
		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		
		mergeSort(low, middle);
		mergeSort(middle + 1, high);
		merge(low, middle, high);

	}

	private void showArray(int[] num) {
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

	private void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			tempArray[i] = num[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while ((i <= middle) && (j <= high)) {
			if (tempArray[i] <= tempArray[j]) {
				num[k] = tempArray[i];
				i++;
			} else {
				num[k] = tempArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			num[k] = tempArray[i];
			i++;
			k++;
		}

		while (j <= high) {
			num[k] = tempArray[j];
			j++;
			k++;
		}
	}

	public boolean isSorted() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > num[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
