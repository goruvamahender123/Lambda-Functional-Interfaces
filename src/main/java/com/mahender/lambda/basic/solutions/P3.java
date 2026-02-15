package com.mahender.lambda.basic.solutions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class P3 {
	public static void main(String[] args) {
	// First way
//		BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a+b;
//		System.out.println(biFunction.apply(10, 9));
		
	// Second way
//		BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
//		System.out.println(binaryOperator.apply(8, 9));
		
	// Third way - Best
		IntBinaryOperator intBinaryOperator = (a, b) -> a+b;
		System.out.println(intBinaryOperator.applyAsInt(9, 0));
	}
}
