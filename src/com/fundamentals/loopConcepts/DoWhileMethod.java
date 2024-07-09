package com.fundamentals.loopConcepts;

public class DoWhileMethod {

	public static void main(String[] args) {

		System.out.println("=========== do-while loop");
		int counter = 0;
		do {
			System.out.println("counter: " + counter++);
		} while (counter < 5);

		do {
			System.out.println("counter is five already: " + counter);
		} while (counter < 5);

		System.out.println("=========== do-while loop with Break statement");
		counter = 0;
		do {
			System.out.println("counter: " + counter++);
			if (counter == 3) {
				break;
			}
		} while (counter < 5);

	}

}
