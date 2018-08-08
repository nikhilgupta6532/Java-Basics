package com.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		Car car = new Car();
		FourWheelers fourWheelers = new FourWheelers();
		
		fourWheelers.performanceMeasure();
		car.performanceMeasure();
	}

}

class FourWheelers {
	public void performanceMeasure() {
		System.out.println("The performance of average four wheeler is 4 stars");
	}
}

class Car extends FourWheelers { 
	public void performanceMeasure() {
		System.out.println("The average car has a performance of 3.5 stars");
	}
}
