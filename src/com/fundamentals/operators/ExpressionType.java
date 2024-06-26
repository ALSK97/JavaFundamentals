package com.fundamentals.operators;

public class ExpressionType {

	public static void main(String[] args) {

		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b + b;
		System.out.println(intExpressionType);
		int intExpressionType2 = s + s;
		System.out.println(intExpressionType2);
		int intExpressionType3 = b + i + c;
		System.out.println(intExpressionType3);

		long longExpressionType = b + l;
		System.out.println(longExpressionType);
		long longExpressionType2 = s + l;
		System.out.println(longExpressionType2);
		long longExpressionType3 = i + l;
		System.out.println(longExpressionType3);
		long longExpressionType4 = b + s + i + l;
		System.out.println(longExpressionType4);

		float floatExpressionType = b + f;
		System.out.println(floatExpressionType);
		float floatExpressionType2 = s + f;
		System.out.println(floatExpressionType2);
		float floatExpressionType3 = i + f;
		System.out.println(floatExpressionType3);
		float floatExpressionType4 = l + f;
		System.out.println(floatExpressionType4);
		float floatExpressionType5 = b + s + i + l + f;
		System.out.println(floatExpressionType5);

		double doubleExpressionType = b + d;
		System.out.println(doubleExpressionType);
		double doubleExpressionType2 = s + d;
		System.out.println(doubleExpressionType2);
		double doubleExpressionType3 = i + d;
		System.out.println(doubleExpressionType3);
		double doubleExpressionType4 = l + d;
		System.out.println(doubleExpressionType4);
		double doubleExpressionType5 = f + d;
		System.out.println(doubleExpressionType5);
		double doubleExpressionType6 = b + s + i + l + f + d;
		System.out.println(doubleExpressionType6);

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		System.out.println("Hello " + 1); // Hello 1
		System.out.println("Hello " + null); // Hello null

	}

}
