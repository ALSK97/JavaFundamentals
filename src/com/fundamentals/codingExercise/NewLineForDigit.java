package com.fundamentals.codingExercise;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter any integer: ");
		String digit = sc.next();

		for (int i = 0; i < digit.length(); i++) {
			System.out.println(digit.charAt(i));
		}

	}

}
