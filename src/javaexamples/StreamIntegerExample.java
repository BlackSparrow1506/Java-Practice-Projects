package javaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 7, 8, 9);
		List<Integer> uniNames = list.stream()
				.distinct()
				.filter(n -> n % 2 == 0) //prime number
				.map(n -> n * n) //sqrt
				.collect(Collectors.toList());
		
		System.out.println(uniNames);

	}

}
