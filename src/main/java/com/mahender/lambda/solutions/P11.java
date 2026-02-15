package com.mahender.lambda.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P11 {
	public static void main(String[] args) {
		
		List<String> stringValues = Arrays.asList("Java", "Python", "C++", "JavaScript");
		
		// First way 
		stringValues.sort(String::compareTo);
		System.out.println("Sorted list based on length: "+stringValues);
		
		// Second way
//		stringValues.sort((a, b) -> a.compareTo(b));
//		System.out.println("Sorted list based on length: "+stringValues);
		
		// Third way
//		stringValues.sort(Comparator.naturalOrder());	
		
		// Fourth way - original list unchanged
//		List<String> sorted = stringValues.stream().sorted().toList();

	}
}
