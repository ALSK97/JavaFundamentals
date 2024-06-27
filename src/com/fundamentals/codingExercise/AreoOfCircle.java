package com.fundamentals.codingExercise;

import java.util.Scanner;

public class AreoOfCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("This program will calculate area of circle.");
		System.out.print("Please, enter circle radius: ");

		double radius = sc.nextDouble();

		double diameter = 2 * radius;
		System.out.println("Circle diameter is: " + diameter);

		double circleCircumference = 2 * Math.PI * radius;
		System.out.println("Circle circumference is: " + circleCircumference);

		double circleArea = Math.PI * radius * radius;
		System.out.println("Area of circle is: " + circleArea);

	}

}
