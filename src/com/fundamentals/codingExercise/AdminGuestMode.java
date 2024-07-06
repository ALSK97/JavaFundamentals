package com.fundamentals.codingExercise;

public class AdminGuestMode {

	public static void main(String[] args) {

		// To check what and how arguments are passed
		/*System.out.println("Number of Command Line Argument = " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
		}
		*/

		String inputArguments = String.join(",", args);
		String adminFlag = "admin";
		String guestFlag = "guest";
		if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
			System.out.println("Please, select either 'ADMIN' or "
					+ "'GUEST' mode for this program");
		} else if (inputArguments.contains(adminFlag)) {
			System.out.println("Hello, Admin!");
		} else if (inputArguments.contains(guestFlag)) {
			System.out.println("Hello, Guest!");
		}
	}

}
