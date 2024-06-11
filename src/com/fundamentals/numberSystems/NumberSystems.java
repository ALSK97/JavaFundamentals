package com.fundamentals.numberSystems;

public class NumberSystems {

	public static void main(String[] args) {
	
		// Decimal Number format
		int decimalInt = 15;
		long decimalLong = 400L;

		System.out.println(decimalInt);		//15
		System.out.println(decimalLong);	//400

		// conversions from decimal to other formats in String
		int decimalNumber = 165;

		String binaryNumber = Integer.toBinaryString(decimalNumber); 	//10100101
		String octalNumber = Integer.toOctalString(decimalNumber);  	//245
		String hexNumber = Integer.toHexString(decimalNumber);  		//a5

		System.out.println(binaryNumber);
		System.out.println(octalNumber);
		System.out.println(hexNumber);

		// Reverse conversions from String to other formats in int
		int decimalFromBinary = Integer.parseInt(binaryNumber, 2);
		int decimalFromOctal = Integer.parseInt(octalNumber, 8);
		int decimalFromHex = Integer.parseInt(hexNumber, 16);

		System.out.println(decimalFromBinary);
		System.out.println(decimalFromOctal);
		System.out.println(decimalFromHex);

		// Binary number format
		int binaryInt = 0b1010; 
		long binaryLong = 0B1010L;

		System.out.println(binaryInt);	//10
		System.out.println(binaryLong);	//10
		
		int octalInt = 0273;
		long octalLong = 0273L;

		System.out.println(octalInt);	//187
		System.out.println(octalLong);	//187
		
		int hexInt = 0x10e; 
		long hexLong = 0XABC1;

		System.out.println(hexInt);		//270
		System.out.println(hexLong);	//43969
		

	}

}
