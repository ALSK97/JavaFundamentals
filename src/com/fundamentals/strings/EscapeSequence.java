package com.fundamentals.strings;

public class EscapeSequence {

	public static void main(String[] args) {

		System.out.println("===== Escape sequences =====");

		System.out.println("\nMy favourite book is \"Mahabaratam\" by Lord Ganesha.");
		System.out.println("Path to the source code: src\\com\\fundamentals\\strings");

		/*
		 	\s - space.
		 	\t - tab.
			\b - backspace (a step backward in the text or deletion of a single character).
			\n - new line.
			\r - carriage return. ()
			\f - form feed.
			\' single quote.
			\" double quote.
			\\ backslash.
		 */

		System.out.println("some text line 1\nsome text line 2");

		System.out.println("Unicode characters, \'\u00A9\' IT-Bulls.com");
		
		System.out.println("Course\s:\s\"Java\""); 

	}

}
