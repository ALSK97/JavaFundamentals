package com.fundamentals.codingExercise;

import java.util.Scanner;

public class SimpleConsoleIntegerCalculator {

	public static void main(String[] args) {

		//		using arguments
		//		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

		//		without using arguments
		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any two integer number: ");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());

		int sum = num1 + num2;
		System.out.println("SUm of " + num1 + " & " + num2 + " = " + sum);
		
		int diff = num1 - num2;
		System.out.println("Difference btw " + num1 + " & " + num2 + " = " + diff);
		
		int mul = num1 * num2;
		System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + mul);
		
		int rem = num1 / num2;
		System.out.println("Remainder of " + num1 + " & " + num2 + " = " + rem);
		
		int quo = num1 % num2;
		System.out.println("Quotient of " + num1 + " & " + num2 + " = " + quo);
		
		int sqr = num1 * num1;
		System.out.println("Square of " + num1 + " = " + sqr);
		sqr = num2 * num2;
		System.out.println("Square of " + num2 + " = " + sqr);
		
		System.out.println("SquareRoot of " + num1 + " = " + Math.sqrt(num1));
		System.out.println("SquareRoot of " + num2 + " = " + Math.sqrt(num2));

	}

}