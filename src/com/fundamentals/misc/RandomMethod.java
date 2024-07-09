package com.fundamentals.misc;

import java.util.Random;

public class RandomMethod {

	public static void main(String[] args) {

		Random r = new Random();

		//		Random Int value
		System.out.println(r.nextInt()); // any Random Int value
		System.out.println(r.nextInt(100)); // any Random Int btw 0 to 100
		System.out.println(r.nextInt(100) + 1); // any Random Int btw 1 to 100

		//		Random Double value
		System.out.println(r.nextDouble()); // any Random Double value
		System.out.println(r.nextDouble(100)); // any Random Double btw 0 to 100
		System.out.println(r.nextDouble(100) + 1); // any Random Double btw 1 to 100

		//		Random Float value
		System.out.println(r.nextFloat()); // any Random Float value
		System.out.println(r.nextFloat(100)); // any Random Float btw 0 to 100
		System.out.println(r.nextFloat(100) + 1); // any Random Float btw 1 to 100

	}

}
