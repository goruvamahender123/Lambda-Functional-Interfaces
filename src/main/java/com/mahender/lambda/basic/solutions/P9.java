package com.mahender.lambda.basic.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class P9 {
	public static void main(String[] args) {

		// First way - Best
//		List<String> stringValues = Arrays.asList("Java", "Python", "C++", "JavaScript");
//
//		List<Integer> integerValues = Arrays.asList(1, 0, 9, 0, 5);
//
//		stringValues.forEach(System.out::println);
//		integerValues.forEach(System.out::println);

		// Second way
//		stringValues.stream().forEach(System.out::println);
//		integerValues.stream().forEach(System.out::println);

//		List<String> values = new ArrayList<>(Arrays.asList("Banana", "Apple", "Papaya", "Guava"));
//		values.sort((a,b) -> a.compareTo(b));
//		System.out.println("Values are "+values);
//		
//		BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Sum is "+(a+b));

//IntPredicate intPredicate = a -> a%2==0;
//System.out.println(intPredicate.test(10) ? "Even" : "Odd");
//
//		Function<Integer, Boolean> function = a -> a % 2 == 0;
//		System.out.println(function.apply(1) ? "Even" : "Odd");
//
//		Integer a = 2;
//		ToIntFunction<Integer> toIntFunction = b -> b * b;
//		System.out.println(toIntFunction.applyAsInt(a));

//		List<String> stringValues = new ArrayList<>(Arrays.asList("Mahe", "Ma", "Hello", "Shiva", "K"));
//		Predicate<String> filterCondition = a -> a.startsWith("M");
//		stringValues.removeIf(filterCondition.negate());
//		System.out.println(stringValues);

//		List<String> stringValues = new ArrayList<>(Arrays.asList("Mahe", "Ma", "Hello", "Shiva", "K"));
//		Predicate<String> filterCondition = a -> a.startsWith("M");
//		List<String> va = stringValues.stream().filter(filterCondition).collect(Collectors.toList());
//		System.out.println(va);

//		String match = "Ma";
//		
//		List<String> stringValues = new ArrayList<>(Arrays.asList("Mahe", "Ma", "ma", "Hello", "Shiva", "K"));
//		Predicate<String> filterCondition = a -> a.regionMatches(true,0,match,0,2);
//		List<String> va = stringValues.stream().filter(filterCondition).collect(Collectors.toList());
//		System.out.println(va);

//		List<Integer> integerValues = new ArrayList<>(Arrays.asList(1, 2, 9, 0, 5));
//		Predicate<Integer> filterCondition = a -> a % 2 != 0;
//		integerValues.removeIf(filterCondition);
//		System.out.println(integerValues);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		values.sort(Comparator.naturalOrder());
//		System.out.println("Sorted List is "+values);
//
//		values.sort(Integer::compareTo);
//		System.out.println("Sorted List is "+values);
//
//		values.sort(Integer::compare);
//		System.out.println("Sorted List is "+values);
//
//		values.sort((a,b) -> a-b);
//		System.out.println("Sorted List is "+values);
//
//		values.sort(Comparator.comparingInt(a -> a));
//		System.out.println("Sorted List is "+values);
//
//		List<Integer> sortedList = values.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		System.out.println("Sorted List is "+sortedList);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		values.sort(Comparator.reverseOrder());
//		System.out.println("Sorted List is "+values);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		values.sort((a,b) -> Integer.compare(b,a));
//		System.out.println("Sorted List is "+values);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		values.sort((a,b) -> b.compareTo(a));
//		System.out.println("Sorted List is "+values);

//		List<Integer> sortedList = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println("Sorted List is "+sortedList);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		Predicate<Integer> filterCondition = Predicate.not(a -> ((a & 1) == 1));
//		List<Integer> evenNumbers = values.stream().filter(Objects::nonNull).filter(filterCondition).collect(Collectors.toList());
//		System.out.println(evenNumbers);

//		List<Integer> values = new ArrayList<>(Arrays.asList(1,3,0,2,9));
//		Predicate<Integer> filterCondition = a -> a % 2 != 0;
//		List<Integer> evenNumbers = values.stream().filter(Objects::nonNull).filter(filterCondition.negate()).collect(Collectors.toList());
//		System.out.println(evenNumbers);
//		
//		List<String> values = new ArrayList<>(Arrays.asList("Java", "Python", "p++", "JavaScript"));
//		List<String> newValues = values.stream().filter(Objects::nonNull).filter(s -> s.regionMatches(true,0,"P",0,1)).toList();
//		System.out.println(newValues);

//		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 3, 10));
		list.stream().filter(Objects::nonNull).filter(((Predicate<Integer>) a -> a %2 !=0).negate()).forEach(System.out::println);
//		Predicate<Integer> lessThan5 = a -> a<5;
//		Predicate<Integer> notEven = a -> a % 2 != 0;
//		list.removeIf(lessThan5.and(notEven));
//		System.out.println(list);

//		List<String> values = new ArrayList<>(Arrays.asList("Banana", "Apple", "Sort", "Cat"));

//				values.sort(Comparator.naturalOrder());
//				values.sort(String::compareTo);
//				values.stream().sorted(Comparator.naturalOrder()).toList();
//				values.sort((a,b) -> a.compareTo(b));
//				values.sort((a,b) -> Integer.compare(a.charAt(0), b.charAt(0)));
//				values.sort(Comparator.comparingInt(a -> a.charAt(0)));

//				System.out.println(values);

//				List<Integer> values = new ArrayList<>(Arrays.asList(1,2,3,4,8, null));
//				boolean result = values.stream().filter(Objects::nonNull).noneMatch(a -> a<0);
//				System.out.println(result);

//				long count = values.stream().filter(Objects::nonNull).filter(a -> a>=0).count();
//				boolean result = (count == values.size());
//				System.out.println(result);

//				List<Integer> result = new ArrayList<>();
//				values.stream().forEach(a -> {
//				  result.add(a*a);
//				  System.out.println(a);
//				});

//				List<String> names = null;
//				Optional.ofNullable(names).orElse(Collections.emptyList()).stream().filter(Objects::nonNull).forEach(System.out::println);
		
//		List<Integer> values = new ArrayList<>(Arrays.asList(1, -9, -7, -8, 5));
//		
//		Function<Integer, Integer> f1 = Math::abs;
//		Function<Integer, String> f2 = a -> "String value is " + a;
//		List<String> result = values.stream()
//		        .map(f1.andThen(f2))
//		        .toList();
//		System.out.println(result);
	
//		values.stream().filter(Objects::nonNull).map(a -> {
//			if (a < 0) {
//				return Math.abs(a);
//			}
//			return null;
//		}).filter(Objects::nonNull).map(a -> "String value is" + a).toList();
		
//		List<Integer> birthYears = Arrays.asList(2000, 2010, 2018, 1999);
//		Function<Integer, String> f1= year -> (year>=18 ? "Adult" : "Minor");
//		Function<Integer,Integer> f2 = year -> (LocalDate.now().getYear() - year);
//		List<String> list = birthYears.stream().filter(Objects::nonNull).map(f1.compose(f2)).toList();
//		System.out.println(list);
		
//		List<String> values = new ArrayList<>(Arrays.asList("JaVa", "Python", "C++", "javaScript", null, ""));
//		List<Integer> lengths = values.stream().filter(Objects::nonNull).filter(Predicate.not(a -> a.trim().isEmpty())).map(String::length).toList();
//		System.out.println(lengths);
		
		Map<String, String> transactions = new HashMap<>();

		transactions.put("TXN1001", "SUCCESS");
		transactions.put("TXN1002", "FAILED");
		transactions.put("TXN1003", "PENDING");
		transactions.put("TXN1004", null);
		List<Integer> lit = List.of(7);
		List<Integer> result = lit.stream().filter(((Predicate<Integer>) n -> n % 2 == 0).or(n -> n > 5)).toList();
		System.out.println(result);
	}
}
