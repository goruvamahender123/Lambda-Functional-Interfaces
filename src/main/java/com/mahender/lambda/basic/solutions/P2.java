package com.mahender.lambda.basic.solutions;

public class P2 {
	public static void main(String[] args) {
		// First way
//		StringFormatter stringFormatter = String::toUpperCase;
//		System.out.println(stringFormatter.format("apple"));

		// Second way
//		MessageProvider messageProvider = () -> "Hello from Lambda";
//		System.out.println(messageProvider.getMessage());

		// Third way - Best
		Greeting greeting = (s) -> System.out.println("Hi " + s);
		doGreet(greeting);
	}

	public static void doGreet(Greeting greeting) {
		greeting.greet("Mahender");
	}
}
