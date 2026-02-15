package com.mahender.lambda.solutions;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class P5 {
	public static void main(String[] args) {
		// First way
//		Function<Integer, Integer> function = n -> n*n;
//		System.out.println(function.apply(8));
		
		// Second way
//		Function<Integer, Integer> function = P5::square;
//		System.out.println(function.apply(8));
		
		// Third way
//		IntUnaryOperator intUnaryOperator = n -> n*n;
//		System.out.println(intUnaryOperator.applyAsInt(9));
		
		// Fourth way
//		Consumer<Integer> consumer = n -> System.out.println(" Square is "+ n * n);
//		consumer.accept(89);
		
		Function<BigDecimal, BigDecimal> squareMoney = a -> a.multiply(a);
		        System.out.println(squareMoney.apply(new BigDecimal("9.0")));
		
	}
	
	public static Integer square(int n) {
		return n * n;
	}
}
