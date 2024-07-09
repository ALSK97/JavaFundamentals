package com.fundamentals.loopConcepts;

public class NestedForLoopMethod {

	public static void main(String[] args) {

		System.out.println("=========== nested loop");
		for (int i = 0; i < 5; i++) {
			System.out.println("*** i = " + i + " ***");
			for (int j = 0; j < 3; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		System.out.println("=========== nested loop with Break statement");
		for (int i = 0; i < 5; i++) {
			// Break first ForLoop
			if (i == 3) {
				break;
			}
			System.out.println("*** i = " + i + " ***");
			for (int j = 0; j < 5; j++) {
				// Break second ForLoop
				if (j == 3) {
					break;
				}
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

}
