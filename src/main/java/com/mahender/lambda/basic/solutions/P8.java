package com.mahender.lambda.basic.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P8 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 0, 9, 0, 5);
		
		// First way for descending order
//		values.sort((a, b) -> b-a);
//		System.out.println("New list with ascending order is "+values);
		
		// Second way for descending order - Best
		values.sort(Comparator.reverseOrder());
		System.out.println("New list with descending order is "+values);
		
		// Third way of descending order
//		List<Integer> list = values.stream().sorted(Comparator.reverseOrder()).toList();
//		System.out.println("New list with descending order is "+list);
	}
}
