package com.fundamentals.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		// Array declaration

		int[] arr;
		int arr1[];

		arr = new int[10];
		arr1 = arr;
		System.out.println(arr.length + ":" + arr1.length);
		System.out.println(arr[0]);

		double[] arr2 = new double[10];
		System.out.println(arr2[0]);

		boolean[] arr3 = new boolean[10];
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);

		// 1-D Array
		int[] matrix_1D = { 5, 2, 4 };
		System.out.print(matrix_1D[0]);
		System.out.print(matrix_1D[1]);
		System.out.print(matrix_1D[2]);
		System.out.println();

		System.out.println(Arrays.toString(matrix_1D));
		Arrays.sort(matrix_1D);
		System.out.println(Arrays.toString(matrix_1D));

		// 2-D Array
		int[][] matrix_2D = {
				{ 9, 1, 6 },
				{ 4, 9, 7 }
		};
		System.out.print(matrix_2D[0][0]);
		System.out.print(matrix_2D[0][1]);
		System.out.print(matrix_2D[0][2]);
		System.out.print(matrix_2D[1][0]);
		System.out.print(matrix_2D[1][1]);
		System.out.print(matrix_2D[1][2]);
		System.out.println();

		int[][] matrix = new int[3][];
		System.out.println(matrix[0]);

		matrix = new int[3][3];
		System.out.println(matrix[0]);

	}

}
