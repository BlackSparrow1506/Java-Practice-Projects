package javaexamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 4, 5, 3, 4, 5, 2, 7, 8};
		Set<Integer> seen = new HashSet<>();
		Arrays.stream(arr)
		.filter(n -> !seen.add(n))
		.distinct()
		.forEach(n -> System.out.println(n));
	}

}
