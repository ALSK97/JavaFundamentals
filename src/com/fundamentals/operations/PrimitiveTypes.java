package com.fundamentals.operations;

public class PrimitiveTypes {

	public static void main(String[] args) {
	
		byte b = 1;
		
		short s = 1;
		
		int i = 1;
		
		long l = 4;
		long ll = 1_000_000_000_000L;
		
		float f = 1.2F;
		
		double d = 1.234D;
		
		char c = 'a';
		
		boolean bool = true;

		// byte conversions
		System.out.println("Byte Conversions : ");
		byte byteCon = (byte)s;
		System.out.println(byteCon);
		byteCon = (byte)i;
		System.out.println(byteCon);
		byteCon = (byte)l;
		System.out.println(byteCon);
		byteCon = (byte)ll;
		System.out.println(byteCon);
		byteCon = (byte)f;
		System.out.println(byteCon);
		byteCon = (byte)d;
		System.out.println(byteCon);
		byteCon = (byte)c;
		System.out.println(byteCon);
		
		
		
		// int conversions
		System.out.println("Int Conversions : ");
		int intCon = (int)b;
		System.out.println(intCon);
		intCon = (int)s;
		System.out.println(intCon);
		intCon = (int)l;
		System.out.println(intCon);
		intCon = (int)ll;
		System.out.println(intCon);
		intCon = (int)f;
		System.out.println(intCon);
		intCon = (int)c;
		System.out.println(intCon);
		
		
		
		// short conversions
		System.out.println("Short Conversions : ");
		short shortCon = (short)b;
		System.out.println(shortCon);
		shortCon = (short)i;
		System.out.println(shortCon);
		shortCon = (short)l;
		System.out.println(shortCon);
		shortCon = (short)ll;
		System.out.println(shortCon);
		shortCon = (short)f;
		System.out.println(shortCon);
		shortCon = (short)c;
		System.out.println(shortCon);
		
		boolean bool2 = bool;
		System.out.println(bool2);
		
		

	}

}
