package com.fundamentals.codingExercise;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter height of the pyramid: ");
		int height = sc.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = height; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
