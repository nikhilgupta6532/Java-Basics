package com.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class Producer {

	 private ReentrantLock lock;

	public Producer() {
		lock = new ReentrantLock();
	}
	public void printExpressions(String expressionValues) {
		lock.lock();
		
		System.out.println("Initiated");
		for(int i=1; i<=5 ; i++) {
			System.out.println("Producing "+i+" : "+expressionValues);
		}
		
		System.out.println("Producer completed");
		
		lock.unlock();
		
	}
	 
	 
}
