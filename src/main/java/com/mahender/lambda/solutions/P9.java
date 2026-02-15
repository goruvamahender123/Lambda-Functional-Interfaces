package com.mahender.lambda.solutions;

import java.util.Arrays;
import java.util.List;

public class P9 {
	public static void main(String[] args) {

		// First way - Best
		List<String> stringValues = Arrays.asList("Java", "Python", "C++", "JavaScript");

		List<Integer> integerValues = Arrays.asList(1, 0, 9, 0, 5);

		stringValues.forEach(System.out::println);
		integerValues.forEach(System.out::println);

		// Second way
//		stringValues.stream().forEach(System.out::println);
//		integerValues.stream().forEach(System.out::println);

	}
}
