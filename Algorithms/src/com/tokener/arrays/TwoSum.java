package com.tokener.arrays;

public class TwoSum {

	public int[] getTwo(int[] A, int s) {
		if (A == null || A.length == 0) {
			return null;
		}
		int i = 0;
		int j = A.length - 1;
		while (i != j) {
			if (A[i] + A[j] > s) {
				j--;
			} else if (A[i] + A[j] < s) {
				i++;
			} else {
				return new int[] { i, j };
			}
		}

		return null;
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] A = { 1, 2, 6, 7, 10, 14, 17, 20, 33, 34 };
		int s = 12;
		int[] result = twoSum.getTwo(A, s);
		if (result != null) {
			for (int c : result) {
				System.out.print(c + " ");
			}
		}
	}
}
