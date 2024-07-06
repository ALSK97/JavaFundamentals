package com.fundamentals.codingExercise;

public class AddNumbersIntegerOrFloat {

	public static void main(String[] args) {

		// To check what and how arguments are passed
		/*System.out.println("Number of Command Line Argument = " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
		}*/

		if (args[0].contains(".") || args[1].contains(".")) {
			double paramDouble1 = Double.parseDouble(args[0]);
			double paramDouble2 = Double.parseDouble(args[1]);
			System.out.println(paramDouble1 + paramDouble2);
		} else {
			int paramInt1 = Integer.parseInt(args[0]);
			int paramInt2 = Integer.parseInt(args[1]);
			System.out.println(paramInt1 + paramInt2);
		}

	}

}
