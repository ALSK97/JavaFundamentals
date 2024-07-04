package com.fundamentals.codingExercise;

import java.util.Formatter;
import java.util.Scanner;

public class FractionDigitsOfPI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== Fraction Digits of PI =====");
		System.out.print("Enter how many fraction of digits to be printed : ");
		int times = sc.nextInt();

		for (int i = 1; i <= times; i++) {
			Formatter formatter = new Formatter();
			formatter.format("%." + i + "f", Math.PI);
			System.out.println(formatter);
		}

	}

}
