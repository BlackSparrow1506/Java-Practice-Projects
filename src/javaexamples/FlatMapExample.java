package javaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> numbers = Arrays.asList(
				Arrays.asList(1, 2), 
				Arrays.asList(10, 4),
				Arrays.asList(5, 12)
				);

		// Using flatMap to flatten the nested lists
		List<Integer> flatNumbers = numbers.stream()
				.flatMap(List::stream)
				.sorted()
				.collect(Collectors.toList());

		System.out.println(flatNumbers); // Output: [1, 2, 3, 4, 5, 6]
	}

}
