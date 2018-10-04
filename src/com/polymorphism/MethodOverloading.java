package com.polymorphism;

public class MethodOverloading {
	
	//some examples of method overloading.
	
	// The Println method is a great example of method overloading.

	public static void main(String[] args) {
		int newScore = calculateScore("Tim",500);
		
		System.out.println("New Score is "+newScore);
		
		calculateScore(1000);
		
		calculateScore();
		
		double centimeters = calcFeetAndInchesToCentimeters(6,0);
		
		if(centimeters < 0.0) {
			System.out.println("Invalid parameters");
		}
		
		calcFeetAndInchesToCentimeters(157);
		
		area(4,5.8f);
	}
	// here we have tow methods with same name having different signatures
	// this is called method overloading.
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player scored "+score+" points");
		return score * 100 ;
	}
	
	public static int calculateScore(String playerName , int score) {
		System.out.println("Player "+playerName +" scored "+score+" points");
		return score * 100 ;
	}
	

	public static int calculateScore() {
		System.out.println("No Player name,no player score");
		return 0 ;
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		if((feet < 0) || ((inches <0) || (inches > 12))) {
			System.out.println("Invalid feet or inches parameter");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet+" feet, "+inches+" inches = "+centimeters+" cm");
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0) {
			return -1;
		}
		
		double feet = (int)inches / 12;
		double remainingInches = (int)inches % 12;
		System.out.println(inches+" inches is equal to "+feet+" feet and "+remainingInches+" inches");
		//recursive call to a function
		return calcFeetAndInchesToCentimeters(feet,remainingInches); 
	}
	
	//ambuigity
	//amb
	public static void area(double x, int y ) {
		System.out.println("Value of x is "+ x);
		System.out.println("Value of y is "+ y);
		System.out.println("Area1");
		
	}
	
	public static void area(int height,double radius) {
		System.out.println("Value of height is "+ height);
		System.out.println("Value of radius is "+ radius);
		System.out.println("Area2");
	}

}
