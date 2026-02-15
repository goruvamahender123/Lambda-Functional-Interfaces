package com.mahender.lambda.solutions;

public class P6 {
	public static void main(String[] args) {
		
		// Anonymous Inner class
//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Mahender");
//				
//			}
//		};
//		runnable.run();
		
		// Replaced anonymous inner class
		Runnable runnable = () -> System.out.println("Mahender");
		runnable.run();
	}
}
