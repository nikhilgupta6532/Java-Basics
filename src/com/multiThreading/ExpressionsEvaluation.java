package com.multiThreading;


public class ExpressionsEvaluation implements Runnable{
	
	Producer produce;
	String expressions;
 
	
	public ExpressionsEvaluation(Producer produce, String expressions) {
		this.produce = produce;
		this.expressions = expressions;
	}


	@Override
	public void run() {
		produce.printExpressions(expressions);
		
	}

}
