package javaexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class findSecondMax {

	public static void main(String[] args) {
	List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 5, 2, 4);
	List<Integer> duplicates = num.stream()
			.distinct()
			.sorted((a, b) -> b - a)
			.skip(1)
			.limit(1)
			.collect(Collectors.toList());
	
	System.out.println(duplicates);
}}

