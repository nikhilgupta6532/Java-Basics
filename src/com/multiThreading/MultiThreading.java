package com.multiThreading;

public class MultiThreading {

	public static void main(String[] args) {
		
		for(int i=0;i<8;i++) {
			MultithreadingDemo ob = new MultithreadingDemo();
			ob.start();
		}

	}

}



class MultithreadingDemo extends Thread
{
 public void run()
 {
     try
     {
         System.out.println ("Thread " +
               Thread.currentThread().getId() +
               " is running");

     }
     catch (Exception e)
     {
         System.out.println ("Exception is caught");
     }
 }
}