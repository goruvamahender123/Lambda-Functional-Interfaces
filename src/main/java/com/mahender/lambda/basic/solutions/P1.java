package com.mahender.lambda.basic.solutions;

import java.util.function.Consumer;

public class P1 {
	public static void main(String[] args) {
		// First way - Best
		new Thread(() -> System.out.println("Hello World")).start();
		
		// Second way
//		Runnable runnable = () -> System.out.println("Hello World");
//		runnable.run();
		
		// Third way
//		String s = "Hello World";
//		Consumer<String> consumer = System.out::println;
//		consumer.accept(s);
		
		
	}
}
