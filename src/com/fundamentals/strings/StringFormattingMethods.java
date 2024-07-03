package com.fundamentals.strings;

public class StringFormattingMethods {

	public static void main(String[] args) {

		System.out.println("===== String formatting =====");
		System.out.println();
		String firstName = "Santosh";

		String greetingsTemplate = "Hello, dear %s! Good %s!";

		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString = String.format(greetingsTemplate, firstName, morning);
		formattedString = String.format(greetingsTemplate, firstName, afternoon);
		formattedString = String.format(greetingsTemplate, firstName, evening);
		System.out.println(formattedString);

		System.out.printf("You have %d computers available at store\n", 10);

	}

}
