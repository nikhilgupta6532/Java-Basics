package com.nikhilgupta;

public class ParsingStrings {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString= "+numberAsString);
		
		// it will convert the string into integer.
		int number = Integer.parseInt(numberAsString);
		System.out.println("number ="+number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println(numberAsString);
		System.out.println(number);

	}

}
