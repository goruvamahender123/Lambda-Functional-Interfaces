package com.mahender.lambda.solutions;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to test whether it is even or not");
		int n = sc.nextInt();
		
		// First way
//		Predicate<Integer> predicate = a -> a%2 == 0;
//		System.out.println(predicate.test(n) ? "isEven" : "Odd");
//		sc.close();
		
		// Second way
//		IntPredicate predicate = a -> a%2 == 0;
//		System.out.println(predicate.test(n) ? "isEven" : "Odd");
//		sc.close();
		
		// Third way - Best
		IntPredicate predicate = P4::isEven;
		System.out.println(predicate.test(n) ? "isEven" : "Odd");
        sc.close();
	}
	
	public static boolean isEven(int n) {
		return n%2 == 0;
	}
}
