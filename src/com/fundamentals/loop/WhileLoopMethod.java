package com.fundamentals.loop;

public class WhileLoopMethod {

	public static void main(String[] args) {

		System.out.println("=========== while loop");
		int counter = 0;
		while (counter < 5) {
			System.out.println("counter: " + counter++);
		}

		System.out.println("=========== while loop with Break statement");
		counter = 0;
		while (counter < 5) {
			if (counter == 3) {
				break;
			}
			System.out.println("counter: " + counter++);
		}

		// Infinite loop
//		while (true) {
//			
//		}

	}

}
