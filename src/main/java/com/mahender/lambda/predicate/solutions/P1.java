package com.mahender.lambda.predicate.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		// First way
//		numbers.forEach((a) -> {
//			if (a % 2 == 0) {
//				System.out.println(a);
//			}
//		});
		
		// Second way
//		List<Integer> list = numbers.stream().filter(a -> a%2 == 0).toList();
//		System.out.println("New even list is :"+list);
		
		// Third way - Best ways
		numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		// Fourth way
//		Predicate<Integer> isEven = n -> n % 2 == 0;
//
//		numbers.forEach(n -> {
//			if (isEven.test(n)) {
//				System.out.println(n);
//			}
//		});

		
	}
}
