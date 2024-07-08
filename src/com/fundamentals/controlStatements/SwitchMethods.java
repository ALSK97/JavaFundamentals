package com.fundamentals.controlStatements;

import java.util.Scanner;

public class SwitchMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// expression types available: byte, short, char, int, String, Enum
		System.out.println("Enter Customer status : ");
		String customerStatus = sc.next();
		switch (customerStatus) {
		case "guest":
			System.out.println("Thank you for your order!");
			break;
		case "regular_customer":
			System.out.println(
					"Thank you for your purchase! Take discount 10% for your order "
							+ "as a gratitude for staying with us.");
			break;
		case "premium_customer":
			System.out.println("Wow! You are our PREMIUM customer! Just take all order "
					+ "for 1 USD.");
			break;
		default:
			System.out.println("Customer doesn't have status set.");
		}

		System.out.println("============ No break demo");
		int i = 1;
		switch (i) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("This is default block");
		}

		System.out.println("============ Default block demo");

		i = 10;
		switch (i) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("This is default block");
		}

	}

}
