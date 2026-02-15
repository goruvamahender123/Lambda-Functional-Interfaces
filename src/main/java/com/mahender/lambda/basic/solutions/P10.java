package com.mahender.lambda.basic.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class P10 {
	public static void main(String[] args) {
		List<String> stringValues = Arrays.asList("Java", "Python", "C++", "JavaScript");
		
		// First way - Best
		stringValues.sort(Comparator.comparingInt(String::length));
		System.out.println(stringValues);
		
		// Second way
//		stringValues.sort((a, b) -> a.length() - b.length());
//		System.out.println(stringValues);
		
		// Third way
//		List<String> sorted = stringValues.stream().sorted(Comparator.comparingInt(String::length)).toList();
//		System.out.println(sorted);

		
	}
}
