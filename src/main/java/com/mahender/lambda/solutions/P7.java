package com.mahender.lambda.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P7 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 0, 9, 0, 5);
		
		// First way for ascending order
//		values.sort((a, b) -> a-b);
//		System.out.println("New list with ascending order is "+values);
				
		// Second way of ascending order
//		values.sort((Integer::compare));
//		System.out.println("New list with ascending order is "+values);
		
		
		// Third way of ascending order
//		List<Integer> list = values.stream().sorted((a, b) -> a-b).toList();
//		System.out.println("New list with ascending order is "+list);
		
		
		// Fourth way of ascending order - Best
		values.sort(Integer::compareTo);
		System.out.println("New list with ascending order is "+values);
		
	}
}
