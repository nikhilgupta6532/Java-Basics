package com.nikhilgupta;

public class ControlFlowStatements {

	public static void main(String[] args) {
		int switchValue = 2 ;
		switch(switchValue) {
		case 1: 
			System.out.println("value was 1");
			break;
			
		case 2: 
			System.out.println("value was 2");
			break;
			
		case 3: case 4: case 5:
			System.out.println("was 3, or a 4, or a 5");
			System.out.println("Actually it was a "+switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2");
			break;
		}

	}

}
