package com.fundamentals.strings;

public class StringComparisonMethods {

	public static void main(String[] args) {

		System.out.println("===== String comparison =====");
		System.out.println();

		String s = " hello ";
		String s2 = " hello ";
		System.out.println("s == s2: " + (s == s2)); // true

		String s3 = new String(" hello ");
		System.out.println("s == s3: " + (s == s3)); // false
		System.out.println("s.equals(s3): " + s.equals(s3)); // true
		System.out.println("s == s3.intern(): " + (s == s3.intern())); // true
		
		String s4 = "world";
		System.out.println("s == s4.intern(): " + (s == s4.intern())); // false

		String firstName = "Santosh";
		String firstName2 = "santosh";
		System.out.println("firstName.equals(firstName2): "
				+ firstName.equals(firstName2)); // false
		System.out.println("firstName.equalsIgnoreCase(firstName2): "
				+ firstName.equalsIgnoreCase(firstName2)); // true

	}

}
