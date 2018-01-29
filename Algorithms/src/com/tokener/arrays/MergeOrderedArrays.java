package com.tokener.arrays;

public class MergeOrderedArrays {

	public int[] merge(int[] A, int[] B) {
		if (A == null || A.length == 0) {
			return B;
		}
		if (B == null || B.length == 0) {
			return A;
		}
		if (A.length == 0 && B.length == 0) {
			return null;
		}

		int[] C = new int[A.length + B.length];

		int i = 0, j = 0;
		for (int m = 0; m < C.length; m++) {
			if (i > A.length - 1) {
				C[m] = B[j++];
			} else if (j > B.length - 1) {
				C[m] = A[i++];
			} else if (A[i] < B[j]) {
				C[m] = A[i++];
			} else {
				C[m] = B[j++];
			}
		}

		return C;
	}

	public static void main(String[] args) {
		MergeOrderedArrays mergeOrderedArrays = new MergeOrderedArrays();

		int[] A = { 1, 2, 3, 5 };
		int[] B = { 2, 3, 4, 8, 10, 17 };

		int[] C = mergeOrderedArrays.merge(A, B);

		for (int c : C) {
			System.out.print(c + ", ");
		}

	}
}
