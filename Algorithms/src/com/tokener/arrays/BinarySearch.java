package com.tokener.arrays;

public class BinarySearch {

	public int find(int[] A, int key) {

		if (A.length == 0) {
			return -1;
		}
		int start = 0;
		int end = A.length - 1;

		while (start <= end) {
			int mid = start - (start - end) / 2;
			if (A[mid] == key) {
				return mid;
			} else if (A[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();

		int[] A = { 1, 2, 2, 4, 5, 7, 9, 11, 23 };
		int key = 2;

		int result = binarySearch.find(A, key);
		System.out.println(result);
	}

}
