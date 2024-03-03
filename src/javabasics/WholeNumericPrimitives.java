package javabasics;

public class WholeNumericPrimitives {

	public static void main(String[] args) {

		long max = 12345678910L;
		Long maxLong = 123_456_789_190L;
		
		
		//OCTAL
		int firstOct = 010;
		int secondOct = 022;
		
		int sum = firstOct + secondOct;
		
		System.out.println("Sum is:" + sum + " and Octal Sum is:" + Integer.toOctalString(sum)) ;
		System.out.println("FirstOct is " + firstOct + " SecondOct is " + secondOct);
		System.out.println("FirstOct in Octal is " + Integer.toOctalString(firstOct) + " SecondOct in Octal is " + Integer.toOctalString(secondOct));
		
		//HEX
		int firstHex = 0xF;
		int secondHex = 0x1E;
		
		int sumHex = firstHex + secondHex;
		System.out.println("First Hex is " + firstHex + " and Second Hex is " + secondHex);
		System.out.println("Sum for hex is : " + sumHex);
		System.out.println("Sum for hex in Hexadecimal is  : " + Integer.toHexString(sumHex));
		
	}

}
