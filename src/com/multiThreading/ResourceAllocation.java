package com.multiThreading;

public class ResourceAllocation {
	
	public static void main(String args[]) {
		
		Producer producer = new Producer();
		
		
		Runnable expression1 = new ExpressionsEvaluation(producer,"I am thread 1");
		Runnable expression2 = new ExpressionsEvaluation(producer,"I am thread 2");
		Runnable expression3 = new ExpressionsEvaluation(producer,"I am thread 3");
		
		Thread t1 = new Thread(expression1);
		Thread t2 = new Thread(expression2);
		Thread t3 = new Thread(expression3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
